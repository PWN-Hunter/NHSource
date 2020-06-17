package com.offsec.nethunter.databinding;
import com.offsec.nethunter.R;
import com.offsec.nethunter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class BtMainBindingImpl extends BtMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.hci_interface, 1);
        sViewsWithIds.put(R.id.divider, 2);
        sViewsWithIds.put(R.id.refreshStatus, 3);
        sViewsWithIds.put(R.id.textView11, 4);
        sViewsWithIds.put(R.id.DBUSstatus, 5);
        sViewsWithIds.put(R.id.guideline_1, 6);
        sViewsWithIds.put(R.id.dbus_switch, 7);
        sViewsWithIds.put(R.id.textView7, 8);
        sViewsWithIds.put(R.id.BTstatus, 9);
        sViewsWithIds.put(R.id.bt_switch, 10);
        sViewsWithIds.put(R.id.guideline_2, 11);
        sViewsWithIds.put(R.id.textView8, 12);
        sViewsWithIds.put(R.id.HCIstatus, 13);
        sViewsWithIds.put(R.id.hci_switch, 14);
        sViewsWithIds.put(R.id.guideline_3, 15);
        sViewsWithIds.put(R.id.divider4, 16);
        sViewsWithIds.put(R.id.textView18, 17);
        sViewsWithIds.put(R.id.bt_time, 18);
        sViewsWithIds.put(R.id.textView19, 19);
        sViewsWithIds.put(R.id.start_scan, 20);
        sViewsWithIds.put(R.id.targets, 21);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public BtMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 22, sIncludes, sViewsWithIds));
    }
    private BtMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[13]
            , (android.widget.Switch) bindings[10]
            , (android.widget.EditText) bindings[18]
            , (android.widget.Switch) bindings[7]
            , (android.view.View) bindings[2]
            , (android.view.View) bindings[16]
            , (androidx.constraintlayout.widget.Guideline) bindings[6]
            , (androidx.constraintlayout.widget.Guideline) bindings[11]
            , (androidx.constraintlayout.widget.Guideline) bindings[15]
            , (android.widget.Spinner) bindings[1]
            , (android.widget.Switch) bindings[14]
            , (android.widget.ImageButton) bindings[3]
            , (android.widget.Button) bindings[20]
            , (android.widget.ListView) bindings[21]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[12]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}