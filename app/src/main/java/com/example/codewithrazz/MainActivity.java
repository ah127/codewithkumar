package com.example.codewithkumar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText numFirst, numSecond, numThird;
    TextView myText;
    Button btnAdd, btnSubtract, btnMulti, btnDiv,btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numFirst = findViewById(R.id.numFirst);
        numSecond = findViewById(R.id.numSecond);
        numThird = findViewById(R.id.numThird);
        btnAdd = findViewById(R.id.btnAdd);
        btnSubtract = findViewById(R.id.btnSubtract);
        btnMulti = findViewById(R.id.btnMulti);
        btnDiv = findViewById(R.id.btnDiv);
        myText = findViewById(R.id.myText);
        btnSave = findViewById(R.id.btnSave);


        btnAdd.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnMulti.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnSave.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() ==R.id.btnAdd){

            btnAdd.setOnClickListener(new View.OnClickListener() { // creating an obj of interface class view onclicklistener
                @Override
                public void onClick(View view) { // auto generate method of interface clss view onclicklistener.
                    int a = Integer.parseInt(numFirst.getText().toString());
                    int b = Integer.parseInt(numSecond.getText().toString());
                    int c = a+b;


                    myText.setText("Result " + String.valueOf(c));

                }
            });
        }

        if (view.getId()== R.id.btnSubtract){

            btnSubtract.setOnClickListener(new View.OnClickListener() { // creating an obj of interface class view onclicklistener
          @Override
            public void onClick(View view) { // auto generate method of interface clss view onclicklistener.
                int a = Integer.parseInt(numFirst.getText().toString());
                int b = Integer.parseInt(numSecond.getText().toString());
                int c = a-b;


                myText.setText("Result " + String.valueOf(c));
                }
        });
        }
        if (view.getId()== R.id.btnDiv){

            btnDiv.setOnClickListener(new View.OnClickListener() { // creating an obj of interface class view onclicklistener
                @Override
                public void onClick(View view) { // auto generate method of interface clss view onclicklistener.
                    int a = Integer.parseInt(numFirst.getText().toString());
                    int b = Integer.parseInt(numSecond.getText().toString());
                    int c = a/b;


                    myText.setText("Result " + String.valueOf(c));

                }
            });
        }
        if (view.getId() == R.id.btnMulti){

            btnDiv.setOnClickListener(new View.OnClickListener() { // creating an obj of interface class view onclicklistener
                @Override
                public void onClick(View view) { // auto generate method of interface clss view onclicklistener.
                    int a = Integer.parseInt(numFirst.getText().toString());
                    int b = Integer.parseInt(numSecond.getText().toString());
                    int c = a/b;


                    myText.setText("Result " + String.valueOf(c));

                }
            });
        }
        if (view.getId()== R.id.btnSave){

            int a = Integer.parseInt(numThird.getText().toString());

            myText.setText("Result"+ String.valueOf(a));
        }

    }
}
