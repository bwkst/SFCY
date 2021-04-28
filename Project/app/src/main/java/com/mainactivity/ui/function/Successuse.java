package com.mainactivity.ui.function;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.mainactivity.R;


public class SuccessUse extends Fragment {

    private Button EndService;
    private Button FeedbackCar;
    private TextView CountTimeNo;
    private CountDownTimer countdowntimer;
    private long TimeLeft = 900000;


    public SuccessUse() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_success_use, container, false);

        CountTimeNo = root.findViewById(R.id.counttimeno);
        UpdateTimer();
        StartStop();

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

    public void StartStop() {
        StartTimer();
    }

    public void StartTimer() {
        countdowntimer = new CountDownTimer(TimeLeft,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeft = 1;
                UpdateTimer();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void UpdateTimer() {
        int minutes = (int) TimeLeft / 60000;
        int seconds = (int) TimeLeft % 60000 / 1000;

        String TimeLeftText;
        TimeLeftText = "" + minutes;
        TimeLeftText += ":";
        if (seconds < 10) TimeLeftText += "0";
        TimeLeftText += seconds;
        
        CountTimeNo.setText(TimeLeftText);
    }
}
