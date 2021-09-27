package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunctionAdd(View view) {
        Log.i("Info", "Button pressed");
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        String first = editTextNumber.getText().toString();
        String second = editTextNumber2.getText().toString();
        String operation = "+";
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(first, second, operation);
    }

    public void clickFunctionSub(View view) {
        Log.i("Info", "Button pressed");
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        String first = editTextNumber.getText().toString();
        String second = editTextNumber2.getText().toString();
        String operation = "-";
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(first, second, operation);
    }

    public void clickFunctionMult(View view) {
        Log.i("Info", "Button pressed");
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        String first = editTextNumber.getText().toString();
        String second = editTextNumber2.getText().toString();
        String operation = "*";
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(first, second, operation);
    }

    public void clickFunctionDiv(View view) {
        Log.i("Info", "Button pressed");
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        EditText editTextNumber2 = (EditText) findViewById(R.id.editTextNumber2);
        String first = editTextNumber.getText().toString();
        String second = editTextNumber2.getText().toString();
        String operation = "/";
//        Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(first, second, operation);
    }

    public void goToActivity2(String first, String second, String operation) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("first", first);
        intent.putExtra("second", second);
        intent.putExtra("operation", operation);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getIntent();
    }
}