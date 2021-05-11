package com.example.exe3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void registo (View view){
        EditText nome1 =(EditText)findViewById(R.id.editTextTextPersonName);
        EditText  nome2 =(EditText)findViewById(R.id.editTextTextPersonName2);


        String nome =nome1.getText().toString();
        String sobreNome =nome2.getText().toString();
        if (nome.isEmpty() || sobreNome.isEmpty()   ) {
            Toast.makeText(MainActivity.this,"Nome não Inserido",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Olá "+nome + " "+sobreNome,Toast.LENGTH_LONG).show();

        }

    }
}