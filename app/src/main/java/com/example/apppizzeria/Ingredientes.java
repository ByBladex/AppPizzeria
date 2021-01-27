package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class Ingredientes extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingredientes);
        Button btnConfirmar= findViewById(R.id.btnConfirmar);
        RadioGroup radioGroupTamaño = findViewById(R.id.radioGroupTamaño);
        RadioButton radioButtonPequeña = findViewById(R.id.radioButtonPequeña);
        RadioButton radioButtonMediana = findViewById(R.id.radioButtonMediana);
        RadioButton radioButtonFamiliar = findViewById(R.id.radioButtonFamiliar);

        btnConfirmar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Confirmacion.class);
                startActivity(intent);
            }
        });
    }
}
