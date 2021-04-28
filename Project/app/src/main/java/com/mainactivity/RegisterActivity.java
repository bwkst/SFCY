package com.mainactivity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends Fragment {

    private Button button;
    private CheckBox checkBox;
    private EditText editText;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.activity_register, container, false);

        button = root.findViewById(R.id.btn_register);
        checkBox = root.findViewById(R.id.cb);
        editText = root.findViewById(R.id.registerpassword);

        //点击按钮跳转主页面
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到主Fragment
                Navigation.findNavController(root).navigate(R.id.mainpage);
            }
        });

        //密码点击icon改变明暗文显示
        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {

                if(isChecked){
                    //如果选中，显示密码
                    editText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
                else{
                    //否则隐藏密码
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }

            }
        });
        return root;
    }
}

/****未完成
 ****剩余用户名及密码长度限制
 ****未按要求填写完整输入框无法点击按钮
 ****/












