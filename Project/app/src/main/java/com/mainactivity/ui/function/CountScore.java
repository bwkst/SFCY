package com.mainactivity.ui.function;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mainactivity.R;


public class CountScore extends Fragment {

    private Button GainButton;
    private Button FeedbackPrice2;

    public CountScore() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_count_score, container, false);

        GainButton = GainButton.findViewById(R.id.paybutton);
        GainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到付费Fragment
                Navigation.findNavController(root).navigate(R.id.navigation_function);
            }
        });

        FeedbackPrice2 = FeedbackPrice2.findViewById(R.id.feedback_price2);
        FeedbackPrice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到计费反馈Fragment
                Navigation.findNavController(root).navigate(R.id.csprice);
            }
        });

        return root;
    }
}
