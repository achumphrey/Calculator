package com.example.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainJavaActivity extends AppCompatActivity {

    public static final String TAG = "MainActivity";

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

        Log.i(TAG, "onCreate: ");

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String usrName = etName.getText().toString();
                displayText.setText("Hello " + usrName + "!");
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                int b;
                //    String numberOne;
                //   String numberTwo;
                if(etNumberOne.getText().toString().equals("")) {
                    a = 0;
                }else{
                    a = Integer.parseInt(etNumberOne.getText().toString());
                }

                if(etNumberTwo.getText().toString().equals("")) {
                    b = 0;
                }else{
                    b = Integer.parseInt(etNumberTwo.getText().toString());
                }

         /*       String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
*/
         /*       int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);*/
                int result = a + b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                int b;
                //    String numberOne;
                //   String numberTwo;
                if(etNumberOne.getText().toString().equals("")) {
                    a = 0;
                }else{
                    a = Integer.parseInt(etNumberOne.getText().toString());
                }

                if(etNumberTwo.getText().toString().equals("")) {
                    b = 0;
                }else{
                    b = Integer.parseInt(etNumberTwo.getText().toString());
                }

          /*      String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();*/

         //       int a = Integer.parseInt(numberOne);
         //       int b = Integer.parseInt(numberTwo);
                int result = a * b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                int b;
                //    String numberOne;
                //   String numberTwo;
                if(etNumberOne.getText().toString().equals("")) {
                    a = 0;
                }else{
                    a = Integer.parseInt(etNumberOne.getText().toString());
                }

                if(etNumberTwo.getText().toString().equals("")) {
                    b = 0;
                }else{
                    b = Integer.parseInt(etNumberTwo.getText().toString());
                }
              /*  String numberOne = etNumberOne.getText().toString();
                String numberTwo = etNumberTwo.getText().toString();
*/
            /*    int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);*/
                int result = a - b;

                tvResult.setText(Integer.toString(result));
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a;
                int b;
            //    String numberOne;
             //   String numberTwo;
                if(etNumberOne.getText().toString().equals("")) {
                   a = 0;
                }else{
                    a = Integer.parseInt(etNumberOne.getText().toString());
                }

                if(etNumberTwo.getText().toString().equals("")) {
                    b = 0;
                }else{
                    b = Integer.parseInt(etNumberTwo.getText().toString());
                }
        //        String numberOne = etNumberOne.getText().toString();
         //       String numberTwo = etNumberTwo.getText().toString();


         /*     int a = Integer.parseInt(numberOne);
                int b = Integer.parseInt(numberTwo);
           */
                Double db = new Double(b);

                String result = "";

                if (db == 0) {
                    result = "Er!";
                } else {
                    result = String.format("%.2f", (a / db));
                }
                tvResult.setText(result);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onReStart: ");
    }
}

