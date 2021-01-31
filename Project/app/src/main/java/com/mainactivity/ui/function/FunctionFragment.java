package com.mainactivity.ui.function;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.mainactivity.R;

public class FunctionFragment extends Fragment {

    private FunctionViewModel FunctionViewModel;
    private Button SuccessUse;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        FunctionViewModel =
                new ViewModelProvider(this).get(FunctionViewModel.class);
        View root = inflater.inflate(R.layout.fragment_function, container, false);
        final TextView textView = root.findViewById(R.id.text_function);
        SuccessUse = SuccessUse.findViewById(R.id.scancodeuse);
        SuccessUse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到Fragment
                Navigation.findNavController(root).navigate(R.id.successuse);
            }
        });
        FunctionViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}

