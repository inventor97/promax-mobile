package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class confimation_number extends AppCompatActivity {

    private EditText firstConfNum;
    private EditText SecondConfNum;
    private EditText thirdConfNum;
    private EditText fourConfNum;

    private TextView oneBtn;
    private TextView twoBtn;
    private TextView thirdBtn;
    private TextView fourBtn;
    private TextView fiveBtn;
    private TextView sixBtn;
    private TextView sevenBtn;
    private TextView eightBtn;
    private TextView nineBtn;
    private TextView zeroBtn;
    private ImageView backspace;
    private ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confimation_number);
        backtoMain();
    }

    private void backtoMain() {
        back = findViewById(R.id.back_btn_confirmation);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(confimation_number.this, sign_in.class);
                startActivity(intent);;
            }
        });
    }
}