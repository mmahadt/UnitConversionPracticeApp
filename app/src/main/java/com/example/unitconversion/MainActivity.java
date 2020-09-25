package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText et_gm = findViewById(R.id.et_grams);
        final TextView tv_kg = findViewById(R.id.tv_kg);

        final EditText et_cm = findViewById(R.id.et_cm);
        final TextView tv_m = findViewById(R.id.tv_meters);

        final EditText et_m = findViewById(R.id.et_meters);
        final TextView tv_km = findViewById(R.id.tv_km);

        Button button = findViewById(R.id.convertBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = et_gm.getText().toString();
                if (text.length() == 0 || "".equals(text)) {
                    tv_kg.setText("Result");
                    Toast.makeText(MainActivity.this, "Please enter some value in grams field.", Toast.LENGTH_SHORT).show();
                } else {
                    //EditText is not empty
                    double value = 0;
                    if (!"".equals(text)) {
                        value = Double.parseDouble(text);
                        value = value / 1000;
                    }
                    tv_kg.setText(Double.toString(value) + " kgs");
                }

                String text1 = et_cm.getText().toString();
                if (text1.length() == 0 || "".equals(text1)) {
                    tv_m.setText("Result");
                    Toast.makeText(MainActivity.this, "Please enter some value in cm field.", Toast.LENGTH_SHORT).show();
                } else {
                    //EditText is not empty
                    double value = 0;
                    if (!"".equals(text1)) {
                        value = Double.parseDouble(text1);
                        value = value * 0.01;
                    }
                    tv_m.setText(Double.toString(value) + " m");
                }

                String text2 = et_m.getText().toString();
                if (text2.length() == 0 || "".equals(text)) {
                    tv_km.setText("Result");
                    Toast.makeText(MainActivity.this, "Please enter some value in meters field.", Toast.LENGTH_SHORT).show();
                } else {
                    //EditText is not empty
                    double value = 0;
                    if (!"".equals(text2)) {
                        value = Double.parseDouble(text2);
                        value = value / 1000;
                    }
                    tv_km.setText(Double.toString(value) + " km");
                }
            }
        });

    }
}
