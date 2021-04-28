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


public class SuccessUse extends Fragment {

    private Button EndService;
    private Button FeedbackCar;

    public SuccessUse() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_success_use, container, false);

        EndService = EndService.findViewById(R.id.endservice);
        EndService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到计费Fragment
                Navigation.findNavController(root).navigate(R.id.countprice);
            }
        });

        FeedbackCar = FeedbackCar.findViewById(R.id.feedback_car);
        FeedbackCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到车辆反馈Fragment
                Navigation.findNavController(root).navigate(R.id.cscar);
            }
        });

        return root;
    }
}
