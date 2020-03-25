package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    Button okButton;
    public static final String EXTRA_MESSAGE1 = "number_one";
    public static final String EXTRA_MESSAGE2 = "number_two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        okButton = findViewById(R.id.button);
        okButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivity(intent);
                sendMessage();

                Context context = getApplicationContext();
                CharSequence message = "You just clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, message,duration);
                toast.show();
                toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
            }
        });
    }

    public void sendMessage() {
        Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.editText2);
        EditText editText2 = (EditText) findViewById(R.id.editText3);
        String message1 = editText1.getText().toString();
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        intent.putExtra(EXTRA_MESSAGE2, message2);
        startActivity(intent);
    }
}
