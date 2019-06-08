package com.example.datatransfer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
EditText firstName,lastName;
RadioButton radioMale,radioFemale;
Button btnSubmit;
Data objData;

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName=(EditText)findViewById(R.id.firstname);
        lastName=(EditText)findViewById(R.id.lastname);
        radioFemale=(RadioButton)findViewById(R.id.radioFemale);
        radioMale=(RadioButton)findViewById(R.id.radioMale);
    final RadioGroup radioBtnGroup = (RadioGroup) findViewById(R.id.radioBtnGroup);
        btnSubmit=(Button)findViewById(R.id.btnSubmit);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                objData.firstname=firstName.getText().toString();
                objData.lastname=lastName.getText().toString();
                if (TextUtils.isEmpty(objData.firstname)||(TextUtils.isEmpty(objData.lastname)))
                {
                    firstName.setError("Enter first name");
                    lastName.setError("Enter last name");
                }
                else{
                    int selectedRadioButtonID=radioBtnGroup.getCheckedRadioButtonId();
                    if (selectedRadioButtonID)
                    Intent i=new Intent(MainActivity.this,Second.class);
                    i.putExtra("data",objData);
                    startActivity(i);
                }


            }
        });

    }
}
