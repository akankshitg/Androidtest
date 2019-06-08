package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText fname,lname,fullname;
Button submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.fname);
        lname=(EditText)findViewById(R.id.lname);
        fullname=(EditText)findViewById(R.id.fullname);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname1=fname.getText().toString();
                String lname1=lname.getText().toString();

                fullname.setText(fname1+" "+lname1);
               //Toast.makeText(MainActivity.this, fname1, Toast.LENGTH_LONG).show();
            }
        });
    }
}
