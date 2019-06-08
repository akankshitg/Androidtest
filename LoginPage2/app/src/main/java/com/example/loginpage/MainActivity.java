package com.example.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText uname,pass;
Button submit,signUP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname=(EditText)findViewById(R.id.uname);

        pass=(EditText)findViewById(R.id.pass);
        submit=(Button)findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                Intent i=new Intent(MainActivity.this,submit.class);
                startActivity(intent);
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if(uname.getText().toString().equalsIgnoreCase(uname))&& (pass.getText().toString().equalsIgnoreCase(pass)){
                    Intent intent=new Intent(MainActivity.this,)
                }
                else{
                    Toast.makeText(MainActivity.this, "Please enter username/password", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
