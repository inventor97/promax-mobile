package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import de.hdodenhof.circleimageview.CircleImageView;

public class reset_pass extends AppCompatActivity {

    private ImageView back;
    private EditText password;
    private EditText confirmPass;
    private Button confirm;
    private CircleImageView avatarImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);

        setBack();
    }

    private void setBack() {
        back = findViewById(R.id.back_btn_reset);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reset_pass.this, sign_in.class);
                startActivity(intent);;
            }
        });
    }
}