package com.mainactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class mainpage extends Fragment {

    private Button mBtnRegister;
    private Button mBtnLogin;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.activity_main, container, false);

        mBtnLogin = root.findViewById(R.id.loginbutton);
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到商城Fragment
                Navigation.findNavController(root).navigate(R.id.navigation_memberarea);
            }
        });


        mBtnRegister = root.findViewById(R.id.registerbutton);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到商城Fragment
                Navigation.findNavController(root).navigate(R.id.registerpage);
            }
        });

        return root;
    }

}

