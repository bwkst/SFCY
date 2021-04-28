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


public class SuccessWin extends Fragment {

    private Button EndService2;
    private Button FeedbackCar2;

    public SuccessWin() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_success_win, container, false);

        EndService2 = EndService2.findViewById(R.id.endservice2);
        EndService2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到计积分Fragment
                Navigation.findNavController(root).navigate(R.id.countscore);
            }
        });

        FeedbackCar2 = FeedbackCar2.findViewById(R.id.feedback_car2);
        FeedbackCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到车辆反馈Fragment
                Navigation.findNavController(root).navigate(R.id.cscar);
            }
        });

        return root;
    }
}
