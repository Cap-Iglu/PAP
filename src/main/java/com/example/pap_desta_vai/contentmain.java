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
import android.widget.TextView;

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
        ImageButton gastronomiabtn = (ImageButton) findViewById(R.id.gastronomiabtn);
        ImageButton menucoimbrabtn = (ImageButton) findViewById(R.id.menucoimbrabtn);
        ImageButton menuevorabtn = (ImageButton) findViewById(R.id.menuevorabtn);
        ImageButton menufarobtn = (ImageButton) findViewById(R.id.menufarobtn);
        ImageButton menuguardabtn = (ImageButton) findViewById(R.id.menuguardabtn);
        ImageButton menuleiriabtn = (ImageButton) findViewById(R.id.menuleiriabtn);
        ImageButton menulisboabtn = (ImageButton) findViewById(R.id.menulisboabtn);
        ImageButton menumadeirabtn = (ImageButton) findViewById(R.id.menumadeirabtn);
        ImageButton menuportalegrebtn = (ImageButton) findViewById(R.id.menuportalegrebtn);
        ImageButton menuportobtn = (ImageButton) findViewById(R.id.menuportobtn);
        ImageButton menusantarembtn = (ImageButton) findViewById(R.id.menusantarembtn);
        ImageButton menusetubalbtn = (ImageButton) findViewById(R.id.menusetubalbtn);
        ImageButton menuvianadocastelobtn = (ImageButton) findViewById(R.id.menuvianadocastelobtn);
        ImageButton menuvilarealbtn = (ImageButton) findViewById(R.id.menuvilarealbtn);

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

        gastronomiabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Gastronomiaact.class);
                startActivity(intent);
            }
        });

        menucoimbrabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Coimbramenuact.class);
                startActivity(intent);
            }
        });

        menuevorabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Evoramenuact.class);
                startActivity(intent);
            }
        });

        menufarobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Faromenuact.class);
                startActivity(intent);
            }
        });

        menuguardabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Guardamenuact.class);
                startActivity(intent);
            }
        });

        menuleiriabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Leiriamenuact.class);
                startActivity(intent);
            }
        });

        menulisboabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Lisboamenuact.class);
                startActivity(intent);
            }
        });

        menumadeirabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Madeiramenuact.class);
                startActivity(intent);
            }
        });

        menuportalegrebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Portalegremenuact.class);
                startActivity(intent);
            }
        });

        menuportobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Portomenuact.class);
                startActivity(intent);
            }
        });

        menusantarembtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Santaremmenuact.class);
                startActivity(intent);
            }
        });

        menusetubalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Setubalmenuact.class);
                startActivity(intent);
            }
        });

        menuvianadocastelobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Vianadocastelomenuact.class);
                startActivity(intent);
            }
        });

        menuvilarealbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(contentmain.this, Vilarealmenuact.class);
                startActivity(intent);
            }
        });
    }
}


