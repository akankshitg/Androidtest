package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText no1,no2,addition,subtraction,multiplication,division;
    Button add;
    Button subtract;
    Button multiply;
    Button divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no1=(EditText)findViewById(R.id.no1);
        no2=(EditText)findViewById(R.id.no2);
        addition=(EditText)findViewById(R.id.addition);
        add=(Button)findViewById(R.id.add);
        add.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
            String number1=no1.getText().toString();
            String number2=no2.getText().toString();

            int n1=Integer.parseInt(number1);
            int n2=Integer.parseInt(number2);
            int c=n1+n2;
            addition.setText(""+c);


            }
        });
        subtraction=(EditText)findViewById(R.id.subtraction);
        subtract=(Button)findViewById(R.id.subtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=no1.getText().toString();
                String number2=no2.getText().toString();

                int n1=Integer.parseInt(number1);
                int n2=Integer.parseInt(number2);
                int c=n1-n2;
                subtraction.setText(""+c);

            }

            });
        multiplication=(EditText)findViewById(R.id.multiplication);
        multiply=(Button)findViewById(R.id.multiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1=no1.getText().toString();
                String number2=no2.getText().toString();

                int n1=Integer.parseInt(number1);
                int n2=Integer.parseInt(number2);
                int c=n1*n2;
                multiplication.setText(""+c);
            }
        });
        division=(EditText)findViewById(R.id.division);
        divide=(Button)findViewById(R.id.divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number1 = no1.getText().toString();
                String number2 = no2.getText().toString();

                int n1 = Integer.parseInt(number1);
                int n2 = Integer.parseInt(number2);
                int c = n1 / n2;
                division.setText("" + c);
            }

        });
    }
}
