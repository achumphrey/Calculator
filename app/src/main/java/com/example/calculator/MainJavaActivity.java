package com.example.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainJavaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSave = findViewById(R.id.btn_save);

        final EditText etName = findViewById(R.id.et_name);

        final TextView tvName = findViewById(R.id.tv_user_name);

        final TextView displayText = findViewById(R.id.tv_user_name);

        final EditText etNumberOne = findViewById(R.id.et_number_one);
        final EditText etNumberTwo = findViewById(R.id.et_number_two);
        Button btnAdd = findViewById(R.id.btn_add);
        final TextView tvResult = findViewById(R.id.tv_result);
        Button btnMultiply = findViewById(R.id.btn_multiply);
        Button btnDivide = findViewById(R.id.btn_divide);
        Button btnSubtract = findViewById(R.id.btn_subtract);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = etName.getText().toString();
                displayText.setText("Hello " + userName + "!");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int result = a + b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int result = a * b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);

                int result = a - b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();

                int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
                Double db = new Double(b);

                double result;
                if (db == 0) {
                    result = 0;
                }else{
                    result = a/db;
                }
                String dbresult = String.format("%.2f", result);
                tvResult.setText(dbresult);
            }
        });
    }
}
