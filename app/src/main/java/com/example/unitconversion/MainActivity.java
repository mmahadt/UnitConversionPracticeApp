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

        final EditText editText = findViewById(R.id.weightInPounds);
        Button button = findViewById(R.id.convertBtn);
        final TextView textView = findViewById(R.id.kgWeight);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = editText.getText().toString();
                if (text.length() == 0 || "".equals(text)) {
                    textView.setText("Result");
                    Toast.makeText(MainActivity.this, "Please enter some value in pounds field.", Toast.LENGTH_SHORT).show();
                } else {
                    //EditText is not empty
                    double value = 0;
                    if (!"".equals(text)) {
                        value = Double.parseDouble(text);
                        value = value * 0.453592;
                    }
                    textView.setText(Double.toString(value)+" kgs");
                }
            }
        });

    }
}
