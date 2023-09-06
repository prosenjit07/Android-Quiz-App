package com.android.samplequizpage;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView outputViewObj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent myGetIntent = getIntent();
        int result = myGetIntent.getIntExtra(MainActivity.userMarks, 0);
        outputViewObj = findViewById(R.id.outputViewID);
        outputViewObj.setText("Your marks is " + result);
    }
}