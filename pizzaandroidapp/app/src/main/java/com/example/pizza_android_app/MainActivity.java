package com.example.pizza_android_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner list;
    String data[]={"Cat","Dog","Horse","Monkey", "Lion","Tiger","Bear","Deer","Rhino","Panda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list=(Spinner)findViewById(R.id.listview);


        //ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,R.layout.layout,data);
        list.setAdapter(adapter);


        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //TextView txt=(TextView)view;
                // Toast.makeText(MainActivity.this, txt.getText().toString(), Toast.LENGTH_SHORT).show();
                switch (position)
                {
                    case 0:
                        Toast.makeText(MainActivity.this, "First", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this, "Second", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this, "Third", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this, "Fourth", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this, "Fifth", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(MainActivity.this, "Sixth", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(MainActivity.this, "Seventh", Toast.LENGTH_SHORT).show();
                    case 8:
                        Toast.makeText(MainActivity.this, "Eighth", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(MainActivity.this, "Nineth", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(MainActivity.this, "Tenth", Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}

