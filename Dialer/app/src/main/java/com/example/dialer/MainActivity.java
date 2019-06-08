package com.example.dialer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    EditText no;
    Button dialer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        no=(EditText)findViewById(R.id.no);
        dialer=(Button) findViewById(R.id.dialer);
        dialer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no1=no.getText().toString();
                Intent i=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+no1));
                startActivity(i);
            }
        });
        Toolbar toolbar= findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar.make(view, text:"Replace with your action", Snackbar.LENGTH_LONG)
                    .setAction)text "Action", listener: null).show();
            });

    }
    @override
