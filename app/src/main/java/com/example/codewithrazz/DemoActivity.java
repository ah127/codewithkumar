package com.example.codewithkumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class DemoActivity extends AppCompatActivity implements View.OnClickListener{


       RadioButton radiobtn1,radiobtn2,radiobtn3;
       ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        radiobtn1 = findViewById(R.id.btn1);
        radiobtn2 = findViewById(R.id.btn2);
        radiobtn3 = findViewById(R.id.btn3);
        img = findViewById(R.id.img);

        radiobtn1.setOnClickListener(this);
        radiobtn2.setOnClickListener(this);
        radiobtn3.setOnClickListener(this);

  }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btn1 :
              img.setImageResource(R.drawable.picone);
                   break;

            case R.id.btn2 :
                img.setImageResource(R.drawable.pictwo);
                break;

            case R.id.btn3 :
                img.setImageResource(R.drawable.picthree);
                    break;
        }
    }
}



