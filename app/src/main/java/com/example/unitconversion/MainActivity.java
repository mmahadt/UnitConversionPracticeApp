package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView heartImage = findViewById(R.id.heartImage);
        Button myButton = findViewById(R.id.imageChangeBtn);

        final Intent intent = new Intent(MainActivity.this, UnitConversion.class);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                heartImage.setImageResource(R.drawable.house);
                startActivity(intent);
            }
        });
    }
}

