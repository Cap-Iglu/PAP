package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class averiomenuact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aveiro_menu);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton infbtn = (ImageButton) findViewById(R.id.infbtn);
        ImageButton pdibtn = (ImageButton) findViewById(R.id.pdibtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(averiomenuact.this, Bragamenuact.Bragancamenuact.Bragapdiact.castelobrancomenuact.cdbact.cndpact.contentmain.class);
                startActivity(intent);
            }
        });

        infbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(averiomenuact.this, Aveiroinfact.class);
                startActivity(intent);
            }
        });

        pdibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(averiomenuact.this, Aveiropdiact.class);
                startActivity(intent);
            }
        });
    }



}