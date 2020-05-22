package com.offsec.nethunter.databinding;
import com.offsec.nethunter.R;
import com.offsec.nethunter.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class MitmfResponderBindingImpl extends MitmfResponderBinding implements com.offsec.nethunter.generated.callback.OnClickListener.Listener {

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
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public MitmfResponderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private MitmfResponderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.CheckBox) bindings[1]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.CheckBox) bindings[6]
            , (android.widget.CheckBox) bindings[7]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mitmfResponder.setTag(null);
        this.mitmfResponderAnalyze.setTag(null);
        this.mitmfResponderFingerprint.setTag(null);
        this.mitmfResponderLM.setTag(null);
        this.mitmfResponderNBTNS.setTag(null);
        this.mitmfResponderWPAD.setTag(null);
        this.mitmfResponderWREDIR.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.offsec.nethunter.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        else if (fieldId == BR.responderChecked) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean viewModelResponderChecked = false;
        com.offsec.nethunter.MITMFViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.responderChecked
                    viewModelResponderChecked = viewModel.isResponderChecked();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mitmfResponder.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mitmfResponderAnalyze.setEnabled(viewModelResponderChecked);
            this.mitmfResponderFingerprint.setEnabled(viewModelResponderChecked);
            this.mitmfResponderLM.setEnabled(viewModelResponderChecked);
            this.mitmfResponderNBTNS.setEnabled(viewModelResponderChecked);
            this.mitmfResponderWPAD.setEnabled(viewModelResponderChecked);
            this.mitmfResponderWREDIR.setEnabled(viewModelResponderChecked);
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



            viewModel.responderClicked(callbackArg_0);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel
        flag 1 (0x2L): viewModel.responderChecked
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}