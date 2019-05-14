package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class AcoresPdiact extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdiacores);

        ImageButton voltarbtn2 = (ImageButton) findViewById(R.id.voltarbtn2);
        ImageButton ldsc_btn = (ImageButton) findViewById(R.id.ldsc_btn);

        voltarbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcoresPdiact.this, Acoresmenuact.class);
                startActivity(intent);
            }
        });

        ldsc_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AcoresPdiact.this, Bragamenuact.Bragancamenuact.Bragapdiact.castelobrancomenuact.cdbact.cndpact.contentmain.ldscact.class);
                startActivity(intent);
            }
        });

    }



}