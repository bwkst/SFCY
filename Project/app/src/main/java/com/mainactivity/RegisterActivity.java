package com.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private Button button;
    private CheckBox checkBox;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        button = (Button) findViewById(R.id.btn_register);
        checkBox = (CheckBox) findViewById(R.id.cb);
        editText = (EditText) findViewById(R.id.registerpassword);

        //点击按钮跳转主页面
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到主页面
                Intent intent = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(intent);
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
    }
}

/****未完成
 ****剩余用户名及密码长度限制
 ****未按要求填写完整输入框无法点击按钮
 ****/












