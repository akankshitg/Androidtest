package com.example.phone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button ph,ph1,ch,un;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            findViewById(R.id.ph).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialContactPhone("9453621381");
                }
            });
            findViewById(R.id.ph1).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialContactPhone("9451237284");
                }
            });
            findViewById(R.id.ch).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialContactPhone("7007218898");
                }
            });
            findViewById(R.id.un).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    dialContactPhone("9721423338");
                }
            });
        }

        private void dialContactPhone(final String phoneNumber) {
            startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
        }
    }



