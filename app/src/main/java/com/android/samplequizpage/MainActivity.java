package com.android.samplequizpage;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    RadioGroup myRadioGroupObj;
    int mark = 0;
    static final String userMarks="key1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myRadioGroupObj = findViewById(R.id.radioGroupID);
    }

    public void submitFunction(View view) {
        if (myRadioGroupObj.getCheckedRadioButtonId() == R.id.radioBtn2Id) {
            mark = 5;
        }
        Intent myIntent = new Intent(this, MainActivity2.class);
        myIntent.putExtra(userMarks, mark);
        startActivity(myIntent);
    }
}
