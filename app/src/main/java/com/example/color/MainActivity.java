package com.example.color;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView red, green, yellow;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        red = (TextView) findViewById(R.id.red);
        green = (TextView) findViewById(R.id.green);
        yellow = (TextView) findViewById(R.id.yellow);
        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                red.setBackgroundColor(Color.parseColor("#FF0000"));
                green.setBackgroundColor(Color.parseColor("#00FF00"));
                yellow.setBackgroundColor(Color.parseColor("#FFFF00"));

            }
        });
    }
}