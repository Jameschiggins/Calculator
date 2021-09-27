package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textView;

    public void clickFunction(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        int first = Integer.parseInt(intent.getStringExtra("first"));
        int second = Integer.parseInt(intent.getStringExtra("second"));
        String operation = intent.getStringExtra("operation");
        if (operation.compareTo("+") == 0)
            textView.setText("" + (first + second));
        else if (operation.compareTo("-") == 0)
            textView.setText("" + (first - second));
        else if (operation.compareTo("*") == 0)
            textView.setText("" + (first * second));
        else
            textView.setText("" + (first / second));
    }
}