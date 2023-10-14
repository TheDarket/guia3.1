package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PantallaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal);

        Button btnAgregarTrabajador = findViewById(R.id.btnAgregarTrabajador);
        Button btnMostrarListaTrabajadores = findViewById(R.id.btnMostrarListaTrabajadores);
        Button btnAcercaDeApp = findViewById(R.id.btnAcercaDeApp);

        btnAgregarTrabajador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PantallaPrincipal.this, SeleccionarTrabajador.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });
        btnMostrarListaTrabajadores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PantallaPrincipal.this, MostrarTrabajadores.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
        btnAcercaDeApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PantallaPrincipal.this, AcercaDe.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });

    }
}
