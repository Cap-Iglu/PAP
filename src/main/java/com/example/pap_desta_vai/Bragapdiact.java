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
import android.webkit.WebView;
import android.widget.ImageButton;

import static com.example.pap_desta_vai.R.menu.menu_main;

public class Bragapdiact extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdibraga);

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);
        ImageButton bjdmbtn = (ImageButton) findViewById(R.id.bjdmbtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bragapdiact.this, Bragamenuact.class);
                startActivity(intent);
            }
        });

        bjdmbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Bragapdiact.this, cdbact.class);
                startActivity(intent);
            }
        });

    }

}