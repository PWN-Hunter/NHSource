package com.offsec.nethunter;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.offsec.nethunter.databinding.BtMainBindingImpl;
import com.offsec.nethunter.databinding.MitmfGeneralBindingImpl;
import com.offsec.nethunter.databinding.MitmfInjectBindingImpl;
import com.offsec.nethunter.databinding.MitmfResponderBindingImpl;
import com.offsec.nethunter.databinding.MitmfSpoofBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_BTMAIN = 1;

  private static final int LAYOUT_MITMFGENERAL = 2;

  private static final int LAYOUT_MITMFINJECT = 3;

  private static final int LAYOUT_MITMFRESPONDER = 4;

  private static final int LAYOUT_MITMFSPOOF = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.offsec.nethunter.R.layout.bt_main, LAYOUT_BTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.offsec.nethunter.R.layout.mitmf_general, LAYOUT_MITMFGENERAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.offsec.nethunter.R.layout.mitmf_inject, LAYOUT_MITMFINJECT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.offsec.nethunter.R.layout.mitmf_responder, LAYOUT_MITMFRESPONDER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.offsec.nethunter.R.layout.mitmf_spoof, LAYOUT_MITMFSPOOF);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_BTMAIN: {
          if ("layout/bt_main_0".equals(tag)) {
            return new BtMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for bt_main is invalid. Received: " + tag);
        }
        case  LAYOUT_MITMFGENERAL: {
          if ("layout/mitmf_general_0".equals(tag)) {
            return new MitmfGeneralBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mitmf_general is invalid. Received: " + tag);
        }
        case  LAYOUT_MITMFINJECT: {
          if ("layout/mitmf_inject_0".equals(tag)) {
            return new MitmfInjectBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mitmf_inject is invalid. Received: " + tag);
        }
        case  LAYOUT_MITMFRESPONDER: {
          if ("layout/mitmf_responder_0".equals(tag)) {
            return new MitmfResponderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mitmf_responder is invalid. Received: " + tag);
        }
        case  LAYOUT_MITMFSPOOF: {
          if ("layout/mitmf_spoof_0".equals(tag)) {
            return new MitmfSpoofBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for mitmf_spoof is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(13);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "injectHTML");
      sKeys.put(2, "injectHTMLPayload");
      sKeys.put(3, "injectHtmlEnabled");
      sKeys.put(4, "injectHtmlUrlEnabled");
      sKeys.put(5, "injectJS");
      sKeys.put(6, "injectJSEnabled");
      sKeys.put(7, "injectionEnabled");
      sKeys.put(8, "intervalChecked");
      sKeys.put(9, "responderChecked");
      sKeys.put(10, "shellShockEnabled");
      sKeys.put(11, "spoofEnabled");
      sKeys.put(12, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/bt_main_0", com.offsec.nethunter.R.layout.bt_main);
      sKeys.put("layout/mitmf_general_0", com.offsec.nethunter.R.layout.mitmf_general);
      sKeys.put("layout/mitmf_inject_0", com.offsec.nethunter.R.layout.mitmf_inject);
      sKeys.put("layout/mitmf_responder_0", com.offsec.nethunter.R.layout.mitmf_responder);
      sKeys.put("layout/mitmf_spoof_0", com.offsec.nethunter.R.layout.mitmf_spoof);
    }
  }
}
