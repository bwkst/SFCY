package com.mainactivity.ui.memberarea;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MemberareaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MemberareaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Memberarea fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

