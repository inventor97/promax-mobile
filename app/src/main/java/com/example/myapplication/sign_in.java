package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_in extends AppCompatActivity {

    private Button signInBtn;
    private TextView fotgotPass;
    private TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        setListeners();
    }

    private void setListeners() {
        signInBtn = findViewById(R.id.sign_in_btn);
        fotgotPass = findViewById(R.id.fotget_pass_option);
        signUp = findViewById(R.id.sign_up_option);

        signInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toMain();
            }
        });
        fotgotPass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toRestorePass();
            }
        });
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toSignUp();
            }
        });
    }

    private void toSignUp() {
        Intent intent = new Intent(sign_in.this, sign_up.class);
        startActivity(intent);;
    }
    private void toRestorePass() {
        Intent intent = new Intent(sign_in.this, confimation_number.class);
        startActivity(intent);;
    }
    private void toMain() {
        Intent intent = new Intent(sign_in.this, MainActivity.class);
        startActivity(intent);;
    }

}