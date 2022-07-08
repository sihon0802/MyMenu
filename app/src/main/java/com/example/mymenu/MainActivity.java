package com.example.mymenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView text1, text2;
    Switch switch1;
    RadioGroup rgp1;
    RadioButton rbn1, rbn2, rbn3;
    ImageView img1;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = findViewById(R.id.text1);
        text2 = findViewById(R.id.text2);
        switch1 = findViewById(R.id.switch1);
        rgp1 = findViewById(R.id.rgp1);
        rbn1 = findViewById(R.id.rbn1);
        rbn2 = findViewById(R.id.rbn2);
        rbn3 = findViewById(R.id.rbn3);
        img1 = findViewById(R.id.img1);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);

        switch1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (switch1.isChecked()==true) {
                    text2.setVisibility(View.VISIBLE);
                    rgp1.setVisibility(View.VISIBLE);
                    img1.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rgp1.setVisibility(View.INVISIBLE);
                    img1.setVisibility(View.INVISIBLE);
                    btn1.setVisibility(View.INVISIBLE);
                    btn2.setVisibility(View.INVISIBLE);
                }
            }
        });
        rbn1.setOnClickListener(this);
        rbn2.setOnClickListener(this);
        rbn3.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.rbn1:
                img1.setImageResource(R.drawable.metamon);
                break;
            case R.id.rbn2:
                img1.setImageResource(R.drawable.cat);
                break;
            case R.id.rbn3:
                img1.setImageResource(R.drawable.totoro);
                break;
            case R.id.btn1:
                finish();
                break;
            case R.id.btn2:
                switch1.setChecked(false);
                rgp1.clearCheck();
                img1.setImageResource(0);
                break;
        }
    }
}