package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Bejapdiact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdibeja);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton cdbbtn = (ImageButton) findViewById(R.id.cdbbtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejapdiact.this, Bejamenuact.class);
                startActivity(intent);
            }
        });

        cdbbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejapdiact.this, cdbact.class);
                startActivity(intent);
            }
        });

    }



}