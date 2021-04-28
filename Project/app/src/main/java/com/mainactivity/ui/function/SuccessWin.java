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


public class SuccessWin extends Fragment {

    private Button EndService2;
    private Button FeedbackCar2;
    private TextView CountTimeNo2;
    private CountDownTimer countdowntimer2;
    private long TimeLeft2 = 900000;


    public SuccessWin() {
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_success_win, container, false);

        CountTimeNo2 = root.findViewById(R.id.counttimeno2);
        UpdateTimer2();
        StartStop2();

        EndService2 = EndService2.findViewById(R.id.endservice2);
        EndService2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到计费Fragment
                Navigation.findNavController(root).navigate(R.id.countscore);
            }
        });

        FeedbackCar2 = FeedbackCar2.findViewById(R.id.feedback_car);
        FeedbackCar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到车辆反馈Fragment
                Navigation.findNavController(root).navigate(R.id.cscar);
            }
        });

        return root;
    }

    public void StartStop2() {
        StartTimer2();
    }

    public void StartTimer2() {
        countdowntimer2 = new CountDownTimer(TimeLeft2,1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                TimeLeft2 = 1;
                UpdateTimer2();
            }

            @Override
            public void onFinish() {

            }
        }.start();
    }

    public void UpdateTimer2() {
        int minutes = (int) TimeLeft2 / 60000;
        int seconds = (int) TimeLeft2 % 60000 / 1000;

        String TimeLeftText2;
        TimeLeftText2 = "" + minutes;
        TimeLeftText2 += ":";
        if (seconds < 10) TimeLeftText2 += "0";
        TimeLeftText2 += seconds;

        CountTimeNo2.setText(TimeLeftText2);
    }
}