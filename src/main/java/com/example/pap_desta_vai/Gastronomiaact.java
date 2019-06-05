package com.example.pap_desta_vai;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Gastronomiaact extends AppCompatActivity {
    private TextView MsgGastro;
    private FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
    private DatabaseReference mRootReference = firebaseDatabase.getReference();
    private DatabaseReference mChildReference = mRootReference.child("message");

    DatabaseReference databasePratos;

    EditText editTextPrato;
    Button buttonAdd;
    Spinner spinnerDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gastronomia);
        MsgGastro = (TextView)findViewById(R.id.MsgGastro);
        MsgGastro.setText("Message appear here...");

        databasePratos = FirebaseDatabase.getInstance().getReference("pratos");

        editTextPrato = (EditText) findViewById(R.id.editTextPrato);
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        spinnerDis = (Spinner) findViewById(R.id.spinnerDis);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addPrato();
            }
        });

        ImageButton voltarbtn = (ImageButton) findViewById(R.id.voltarbtn);

        voltarbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Gastronomiaact.this, contentmain.class);
                startActivity(intent);
            }
        });

        Spinner dropdown = findViewById(R.id.spinnerDis);
//create a list of items for the spinner.
        String[] items = new String[]{"Açores", "Aveiro", "Beja", "Braga", "Bragança", "Castelo Branco"};
//create an adapter to describe how the items are displayed, adapters are used in several places in android.
//There are multiple variations of this, but this is the basic variant.
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
//set the spinners adapter to the previously created one.
        dropdown.setAdapter(adapter);
    }

    private void addPrato(){
        String prato_nome = editTextPrato.getText().toString().trim();
        String distrito = spinnerDis.getSelectedItem().toString();

        if(!TextUtils.isEmpty(prato_nome)){

            String id = databasePratos.push().getKey();

            Prato prato = new Prato(id, prato_nome, distrito);

            databasePratos.child(id).setValue(prato);

            Toast.makeText(this, "Prato adicionado", Toast.LENGTH_LONG).show();

        }else{
            Toast.makeText(this, "Insira um nome de um prato", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        mChildReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                String message = dataSnapshot.getValue(String.class);
                MsgGastro.setText(message);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
