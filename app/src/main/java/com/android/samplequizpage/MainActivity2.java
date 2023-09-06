package com.android.samplequizpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {
    RadioGroup myRadioGroupObj;
    int mark = 0;
    static final String userMarks="key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myRadioGroupObj = findViewById(R.id.radioGroupID);

        Intent myGetIntent = getIntent();
        int result = myGetIntent.getIntExtra(MainActivity.userMarks, 0);
        mark += result;
    }

    public void submitFunction(View view) {
        if (myRadioGroupObj.getCheckedRadioButtonId() == R.id.radioBtn1Id) {
            mark += 5;
        }
        Intent myIntent = new Intent(this, MainActivity3.class);
        myIntent.putExtra(userMarks, mark);
        startActivity(myIntent);
    }
}