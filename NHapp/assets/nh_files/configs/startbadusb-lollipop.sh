#!/system/bin/sh

TMPDIR=/data/local/tmp
mkdir -p $TMPDIR
INTERFACE=rndis0
UPSTREAM=wlan0

# execute su

su

# Check required tools
if ! busybox ls > /dev/null;then
    echo No busybox found
    exit 1
fi
if ! dnsmasq -v > /dev/null;then
    echo No dnsmasq found
    exit 1
fi
if ! busybox test -e /config/usb_gadget/g1/functions/gsi.rndis;then
    echo "Device doesn't support gsi.rndis"
    echo "contact kernel dev and blame him!!"
    exit 1
fi

echo "iptables check"

if ! iptables -V;then
    echo iptables not found
    exit 1
fi

echo "Doing rndis stuff"

# We have to disable the usb interface before reconfiguring it
setprop sys.usb.config rndis
wait 60
# Cat the gsi.rndis config
echo "Info of rndis"
cat /config/usb_gadget/g1/functions/gsi.rndis/info
echo "end of the info"
echo ""
# Check whether it has applied the changes
cat /config/usb_gadget/g1/configs/*/strings/*/configuration

# Wait until the interface actually exists
while ! busybox ifconfig $INTERFACE > /dev/null 2>&1;do
    echo Waiting for interface $INTERFACE
    busybox sleep 1
done
echo "done waitibg the $INTERFACE "
# Configure interface, firewall and packet forwarding
#busybox ifconfig $INTERFACE inet 10.0.0.1 netmask 255.255.255.0 up
echo "flushing $INTERFACE"
ip addr flush dev $INTERFACE
echo "giving $INTERFACE ip"
ip addr add 10.0.0.1/24 dev $INTERFACE
echo "make the $INTERFACE live"
ip link set $INTERFACE up


echo "some weird shit 1"
for table in $(ip rule list | awk -F"lookup" '{print $2}');
do
DEF=`ip route show table $table|grep default|grep $UPSTREAM`
if ! [ -z "$DEF" ]; then
   break
fi
done
echo "some weird shit 2"
ip route add 10.0.0.0/24 dev $INTERFACE scope link table $table
ip route add default via 10.0.0.1 dev $INTERFACE
echo "some weird shit 3"
iptables -I FORWARD 1 -i $INTERFACE -j ACCEPT
echo "1"
iptables -t nat -I POSTROUTING 1 -j MASQUERADE
echo "2"
iptables -D natctrl_FORWARD -j DROP
echo "3"
echo 1 > /proc/sys/net/ipv4/ip_forward

# dnsmasq -H /data/local/tmp/hosts -i $INTERFACE -R -S 8.8.8.8 -F 10.0.0.100,10.0.0.200 -x $TMPDIR/dnsmasq.pid
echo "4"
dnsmasq -C /sdcard/nh_files/configs/dnsmasq.conf -x $TMPDIR/dnsmasq.pid -i $INTERFACE

## log-facility=/sdcard/nh_files/dnsmasq.log
## #address=/#/10.0.0.1
## #address=/google.com/10.0.0.1
## interface=rndis0
## dhcp-range=10.0.0.10,10.0.0.250,12h
## dhcp-option=3,10.0.0.1
## dhcp-option=6,10.0.0.1
## #no-resolv
## log-queries
## server=208.67.222.222

#echo "Hit enter to kill me"
#read
#pkill dnsmasq
## Restoring iptables rules
#iptables -D FORWARD -i $INTERFACE -j ACCEPT
#iptables -t nat -D POSTROUTING -j MASQUERADE
#iptables -A natctrl_FORWARD -j DROP
## Remove iface and routes
#ip addr flush dev $INTERFACE
#ip link set $INTERFACE down
