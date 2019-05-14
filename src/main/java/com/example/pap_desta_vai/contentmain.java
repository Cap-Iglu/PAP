package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.widget.ImageButton;

import static com.example.pap_desta_vai.R.menu.menu_main;

public class contentmain extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton menuacoresbtn = (ImageButton) findViewById(R.id.menuacoresbtn);
        ImageButton menuaveirobtn = (ImageButton) findViewById(R.id.menuaveirobtn);
        ImageButton menubejabtn = (ImageButton) findViewById(R.id.menubejabtn);
        ImageButton menubragabtn = (ImageButton) findViewById(R.id.menubragabtn);
        ImageButton menubragancabtn = (ImageButton) findViewById(R.id.menubragancabtn);
        ImageButton menucastelobrancobtn = (ImageButton) findViewById(R.id.menucastelobrancobtn);

        menuacoresbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Acoresmenuact.class);
                startActivity(intent);
            }
        });

        menuaveirobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, averiomenuact.class);
                startActivity(intent);
            }
        });

        menubejabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Bejamenuact.class);
                startActivity(intent);
            }
        });

        menubragabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Bragamenuact.class);
                startActivity(intent);
            }
        });

        menubragancabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Bragancamenuact.class);
                startActivity(intent);
            }
        });

        menucastelobrancobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, castelobrancomenuact.class);
                startActivity(intent);
            }
        });
    }
}


