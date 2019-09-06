package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button trueButton;
    private Button falseButton;
    private String CLASS_TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trueButton = (Button) findViewById(R.id.trueButton);
        falseButton = (Button) findViewById(R.id.falseButton);

        trueButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(CLASS_TAG,"Clicked true button");
                Toast trueMsg = Toast.makeText(getApplicationContext(), "Correct",Toast.LENGTH_LONG);
                trueMsg.show();
            }
        });


        falseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(CLASS_TAG,"Clicked false button");
                Toast falseMsg = Toast.makeText(getApplicationContext(), "Incorrect",Toast.LENGTH_LONG);
                falseMsg.show();
            }
        });


    }
}
