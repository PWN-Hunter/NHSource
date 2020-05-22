package com.offsec.nethunter.databinding;
import com.offsec.nethunter.R;
import com.offsec.nethunter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MitmfSpoofBindingImpl extends MitmfSpoofBinding implements com.offsec.nethunter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MitmfSpoofBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MitmfSpoofBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.Spinner) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.Spinner) bindings[2]
            , (android.widget.CheckBox) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mitmfEnablespoof.setTag(null);
        this.mitmfSpoofArpmodespin.setTag(null);
        this.mitmfSpoofGatewayText.setTag(null);
        this.mitmfSpoofRedirectspin.setTag(null);
        this.mitmfSpoofShellshock.setTag(null);
        this.mitmfSpoofShellshockText.setTag(null);
        this.mitmfSpoofTargetsText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.offsec.nethunter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        updateRegistration(0, ViewModel);
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
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
        else if (fieldId == BR.spoofEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.shellShockEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        boolean viewModelShellShockEnabled = false;
        com.offsec.nethunter.MITMFViewModel viewModel = mViewModel;
        boolean viewModelSpoofEnabled = false;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.shellShockEnabled
                        viewModelShellShockEnabled = viewModel.isShellShockEnabled();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.spoofEnabled
                        viewModelSpoofEnabled = viewModel.isSpoofEnabled();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mitmfEnablespoof.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            this.mitmfSpoofArpmodespin.setEnabled(viewModelSpoofEnabled);
            this.mitmfSpoofGatewayText.setEnabled(viewModelSpoofEnabled);
            this.mitmfSpoofRedirectspin.setEnabled(viewModelSpoofEnabled);
            this.mitmfSpoofShellshock.setEnabled(viewModelSpoofEnabled);
            this.mitmfSpoofTargetsText.setEnabled(viewModelSpoofEnabled);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.mitmfSpoofShellshockText.setEnabled(viewModelShellShockEnabled);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.offsec.nethunter.MITMFViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {



            viewModel.clickSpoof(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.spoofEnabled
        flag 2 (0x3L): viewModel.shellShockEnabled
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}