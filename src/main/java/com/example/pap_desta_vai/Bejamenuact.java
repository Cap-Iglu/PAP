package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Bejamenuact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beja_menu);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton infbtn = (ImageButton) findViewById(R.id.infbtn);
        ImageButton pdibtn = (ImageButton) findViewById(R.id.pdibtn);
        Button gastrobtn = (Button) findViewById(R.id.gastrobtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejamenuact.this, contentmain.class);
                startActivity(intent);
            }
        });

        infbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejamenuact.this, Bejainfact.class);
                startActivity(intent);
            }
        });

        pdibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejamenuact.this, Bejapdiact.class);
                startActivity(intent);
            }
        });

        gastrobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bejamenuact.this, Gastronomiaact.class);
                startActivity(intent);
            }
        });

    }



}