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


public class CountPrice extends Fragment {

    private Button PayButton;
    private Button FeedbackPrice;

    public CountPrice() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_count_price, container, false);

        PayButton = PayButton.findViewById(R.id.paybutton);
        PayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到付费Fragment
                Navigation.findNavController(root).navigate(R.id.pay);
            }
        });

        FeedbackPrice = FeedbackPrice.findViewById(R.id.feedback_price);
        FeedbackPrice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到计费反馈Fragment
                Navigation.findNavController(root).navigate(R.id.csprice);
            }
        });

        return root;
    }
}
