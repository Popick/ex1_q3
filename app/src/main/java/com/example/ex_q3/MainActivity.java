package com.example.ex_q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click(View view) {
        counter++;
        Button btn1 = (Button) findViewById(R.id.btn);
        if (counter==6){
            btn1.setText("Enough to click. Go to new start!");
            counter=0;
        }else{
            btn1.setText("This is a click number: "+counter);
        }
    }

}