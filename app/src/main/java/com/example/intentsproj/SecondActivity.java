package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    EditText number1, number2;
    TextView result;
    Button addition, subtraction, multiplication, division;
    int no1, no2;
    float results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(FirstActivity.EXTRA_MESSAGE2);

        number1 = findViewById(R.id.editText);
        number1.setText(message1);
        number2 = findViewById(R.id.editText4);
        number2.setText(message2);

        result = findViewById(R.id.textView7);

        addition = findViewById(R.id.button2);
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());
                results = no1 + no2;
                result.setText(String.valueOf(results));
            }
        });

        subtraction = findViewById(R.id.button3);
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());
                results = no1 - no2;
                result.setText(String.valueOf(results));
            }
        });

        multiplication = findViewById(R.id.button4);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());
                results = no1 * no2;
                result.setText(String.valueOf(results));
            }
        });

        division = findViewById(R.id.button5);
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                no1 = Integer.parseInt(number1.getText().toString());
                no2 = Integer.parseInt(number2.getText().toString());
                results = no1 / no2;
                result.setText(String.valueOf(results));
            }
        });


    }
}
