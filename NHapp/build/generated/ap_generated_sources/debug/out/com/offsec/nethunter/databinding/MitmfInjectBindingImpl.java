package com.offsec.nethunter.databinding;
import com.offsec.nethunter.R;
import com.offsec.nethunter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MitmfInjectBindingImpl extends MitmfInjectBinding implements com.offsec.nethunter.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.textView, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MitmfInjectBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private MitmfInjectBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[1]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[10]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.CheckBox) bindings[2]
            , (com.google.android.material.textfield.TextInputEditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[8]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (com.google.android.material.textfield.TextInputEditText) bindings[6]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.TextView) bindings[11]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mitmfEnableinject.setTag(null);
        this.mitmfInjectIpText.setTag(null);
        this.mitmfInjectNoipText.setTag(null);
        this.mitmfInjectOnceperdomain.setTag(null);
        this.mitmfInjectPreservecache.setTag(null);
        this.mitmfInjectRateseconds.setTag(null);
        this.mitmfInjectTimesText.setTag(null);
        this.mitmfInjecthtmlUrl.setTag(null);
        this.mitmfInjecthtmlpayText.setTag(null);
        this.mitmfInjectjsUrl.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.offsec.nethunter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
        else if (fieldId == BR.injectionEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        else if (fieldId == BR.injectJSEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        else if (fieldId == BR.injectHtmlUrlEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        else if (fieldId == BR.injectHtmlEnabled) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        boolean viewModelInjectionEnabled = false;
        boolean viewModelInjectJSEnabled = false;
        android.text.TextWatcher viewModelInjectHtmlWatcher = null;
        boolean viewModelInjectHtmlUrlEnabled = false;
        boolean viewModelInjectHtmlEnabled = false;
        com.offsec.nethunter.MITMFViewModel viewModel = mViewModel;
        android.text.TextWatcher viewModelInjectHtmlUrlWatcher = null;
        android.text.TextWatcher viewModelInjectJSWatcher = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x23L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.injectionEnabled
                        viewModelInjectionEnabled = viewModel.isInjectionEnabled();
                    }
            }
            if ((dirtyFlags & 0x25L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.injectJSEnabled
                        viewModelInjectJSEnabled = viewModel.isInjectJSEnabled();
                    }
            }
            if ((dirtyFlags & 0x21L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.injectHtmlWatcher
                        viewModelInjectHtmlWatcher = viewModel.injectHtmlWatcher;
                        // read viewModel.injectHtmlUrlWatcher
                        viewModelInjectHtmlUrlWatcher = viewModel.injectHtmlUrlWatcher;
                        // read viewModel.injectJSWatcher
                        viewModelInjectJSWatcher = viewModel.injectJSWatcher;
                    }
            }
            if ((dirtyFlags & 0x29L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.injectHtmlUrlEnabled
                        viewModelInjectHtmlUrlEnabled = viewModel.isInjectHtmlUrlEnabled();
                    }
            }
            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.injectHtmlEnabled
                        viewModelInjectHtmlEnabled = viewModel.isInjectHtmlEnabled();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            this.mitmfEnableinject.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            this.mitmfInjectIpText.setEnabled(viewModelInjectionEnabled);
            this.mitmfInjectNoipText.setEnabled(viewModelInjectionEnabled);
            this.mitmfInjectOnceperdomain.setEnabled(viewModelInjectionEnabled);
            this.mitmfInjectPreservecache.setEnabled(viewModelInjectionEnabled);
            this.mitmfInjectRateseconds.setEnabled(viewModelInjectionEnabled);
            this.mitmfInjectTimesText.setEnabled(viewModelInjectionEnabled);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            this.mitmfInjecthtmlUrl.setEnabled(viewModelInjectHtmlUrlEnabled);
        }
        if ((dirtyFlags & 0x21L) != 0) {
            // api target 1

            this.mitmfInjecthtmlUrl.addTextChangedListener(viewModelInjectHtmlUrlWatcher);
            this.mitmfInjecthtmlpayText.addTextChangedListener(viewModelInjectHtmlWatcher);
            this.mitmfInjectjsUrl.addTextChangedListener(viewModelInjectJSWatcher);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.mitmfInjecthtmlpayText.setEnabled(viewModelInjectHtmlEnabled);
        }
        if ((dirtyFlags & 0x25L) != 0) {
            // api target 1

            this.mitmfInjectjsUrl.setEnabled(viewModelInjectJSEnabled);
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



            viewModel.clickInject(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.injectionEnabled
        flag 2 (0x3L): viewModel.injectJSEnabled
        flag 3 (0x4L): viewModel.injectHtmlUrlEnabled
        flag 4 (0x5L): viewModel.injectHtmlEnabled
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}