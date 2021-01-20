package com.example.apppizzeria;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Pedido extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
        Button btnUltPedidos = findViewById(R.id.btnUltimosPedidos);
        Button btnIngredientes= findViewById(R.id.btnIngredientes);
        Button btnEspecialidades = findViewById(R.id.btnEspecialidades);

        btnUltPedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), UltimosPedidos.class);
                startActivity(intent);
            }
        });
        btnIngredientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Ingredientes.class);
                startActivity(intent);
            }
        });
        btnEspecialidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Especialidades.class);
                startActivity(intent);
            }
        });
    }
}
