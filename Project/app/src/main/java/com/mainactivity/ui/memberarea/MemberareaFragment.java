package com.mainactivity.ui.memberarea;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mainactivity.R;

public class MemberareaFragment extends Fragment {

    private MemberareaViewModel MemberareaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        MemberareaViewModel =
                new ViewModelProvider(this).get(MemberareaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_memberarea, container, false);
        final TextView textView = root.findViewById(R.id.text_memberarea);
        MemberareaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

