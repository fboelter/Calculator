package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public void addFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        float first = Float.valueOf(firstNum.getText().toString());
        float second = Float.valueOf(secondNum.getText().toString());

        goToDisplay(first + second);
    }
    public void subFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        float first = Float.valueOf(firstNum.getText().toString());
        float second = Float.valueOf(secondNum.getText().toString());

        goToDisplay(first - second);
    }
    public void multFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        float first = Float.valueOf(firstNum.getText().toString());
        float second = Float.valueOf(secondNum.getText().toString());

        goToDisplay(first * second);
    }
    public void divFunction(View view){
        EditText firstNum = (EditText) findViewById(R.id.firstNum);
        EditText secondNum = (EditText) findViewById(R.id.secondNum);

        float first = Float.valueOf(firstNum.getText().toString());
        float second = Float.valueOf(secondNum.getText().toString());

        goToDisplay(first / second);
    }

    public void goToDisplay(Float f){
        Intent intent = new Intent(this, DisplayCalculation.class);
        intent.putExtra("message", f.toString());
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}