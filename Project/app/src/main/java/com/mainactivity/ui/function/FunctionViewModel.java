package com.mainactivity.ui.function;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FunctionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public FunctionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Function fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

