package com.offsec.nethunter.databinding;
import com.offsec.nethunter.R;
import com.offsec.nethunter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MitmfGeneralBindingImpl extends MitmfGeneralBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.mitmf_interface, 1);
        sViewsWithIds.put(R.id.textView17, 2);
        sViewsWithIds.put(R.id.mitmf_jskey, 3);
        sViewsWithIds.put(R.id.mitmf_ferretng, 4);
        sViewsWithIds.put(R.id.mitmf_browserprofile, 5);
        sViewsWithIds.put(R.id.mitmf_filepwn, 6);
        sViewsWithIds.put(R.id.mitmf_smb, 7);
        sViewsWithIds.put(R.id.mitmf_smb_trap, 8);
        sViewsWithIds.put(R.id.mitmf_sslstrip, 9);
        sViewsWithIds.put(R.id.mitmf_app_poison, 10);
        sViewsWithIds.put(R.id.mitmf_upsidedown, 11);
        sViewsWithIds.put(R.id.mitmf_screenshotter, 12);
        sViewsWithIds.put(R.id.mitmf_screen_interval, 13);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MitmfGeneralBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private MitmfGeneralBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[10]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.CheckBox) bindings[6]
            , (android.widget.Spinner) bindings[1]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.EditText) bindings[13]
            , (android.widget.CheckBox) bindings[12]
            , (android.widget.CheckBox) bindings[7]
            , (android.widget.CheckBox) bindings[8]
            , (android.widget.CheckBox) bindings[9]
            , (android.widget.CheckBox) bindings[11]
            , (android.widget.TextView) bindings[2]
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
                mDirtyFlags = 0x2L;
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
        if (BR.viewModel == variableId) {
            setViewModel((com.offsec.nethunter.MITMFViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.offsec.nethunter.MITMFViewModel ViewModel) {
        this.mViewModel = ViewModel;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModel((com.offsec.nethunter.MITMFViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModel(com.offsec.nethunter.MITMFViewModel ViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}