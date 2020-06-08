package com.example.matala_07;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    Switch sw;
    boolean bo;
    RadioButton rb1, rb2, rb3, rb4;
    LinearLayout lL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sw = (Switch) findViewById(R.id.sw);
        rb1 = (RadioButton) findViewById(R.id.rb1);
        rb2 = (RadioButton) findViewById(R.id.rb2);
        rb3 = (RadioButton) findViewById(R.id.rb3);
        rb4 = (RadioButton) findViewById(R.id.rb4);
        lL = (LinearLayout) findViewById(R.id.ActivityMain);
    }

    public void check(View view) {
        if (sw.isChecked()){
            if (rb1.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.RED);
            if (rb2.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.GREEN);
            if (rb3.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.BLUE);
            if (rb4.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
            else
                Toast.makeText(this, "Click to change the color", Toast.LENGTH_SHORT).show();
        }
    }
    public void click(View view) {
        if (rb1.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.RED);
        if (rb2.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        if (rb3.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        if (rb4.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
    }

    public void rb1(View view) {
        if (sw.isChecked()) {
            if (rb1.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.RED);
        }
        else Toast.makeText(this, "Click on the button to change the color", Toast.LENGTH_SHORT).show();

    }

    public void rb4(View view) {
        if (sw.isChecked()) {
            if (rb4.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.GREEN);
        }
        else Toast.makeText(this, "Click on the button to change the color", Toast.LENGTH_SHORT).show();
    }

    public void rb3(View view) {
        if (sw.isChecked()) {
            if (rb3.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.BLUE);
        }
        else Toast.makeText(this, "Click on the button to change the color", Toast.LENGTH_SHORT).show();
    }

    public void rb2(View view) {
        if (sw.isChecked()) {
            if (rb2.isChecked()) getWindow().getDecorView().setBackgroundColor(Color.YELLOW);
        }
        else Toast.makeText(this, "Click on the button to change the color", Toast.LENGTH_SHORT).show();
    }
}









