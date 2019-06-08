package com.example.datatransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.example.datatransfer.Data;

public class Second extends AppCompatActivity {
    EditText txt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        txt= (EditText) findViewById(R.id.txt);

        //Bundle extras=getIntent().getExtras();
        Data objData = (Data) getIntent().getExtras().get("data");



        txt.setText(txt1);
    }
}
