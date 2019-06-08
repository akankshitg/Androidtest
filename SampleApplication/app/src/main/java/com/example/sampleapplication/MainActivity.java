package com.example.sampleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText fname,lname;
Button submit;
TextView fullname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fname=(EditText)findViewById(R.id.fname);



        lname=(EditText)findViewById(R.id.lname);
        submit=(Button)findViewById(R.id.submit);
        fullname=(TextView)findViewById(R.id.fullname);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String fname1=fname.getText().toString();
            String lname1=lname.getText().toString();
            if(TextUtils.isEmpty(fname1))
            {
                fname.setError("please Enter name");
            }
            else if(TextUtils.isEmpty(lname1))
            {
                lname.setError("Enter last nanme");
            }
            else
            {
            fullname.setText(fname1+""+lname1);

            }
        }

    });
    }
}