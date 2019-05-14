package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Aveiropdiact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdiaveiro);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton cndp_btn = (ImageButton) findViewById(R.id.cndp_btn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aveiropdiact.this, averiomenuact.class);
                startActivity(intent);
            }
        });

        cndp_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aveiropdiact.this, Bragamenuact.Bragancamenuact.Bragapdiact.castelobrancomenuact.cdbact.cndpact.class);
                startActivity(intent);
            }
        });

    }



}