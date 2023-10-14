package com.example.guia3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import androidx.appcompat.app.AppCompatActivity;

public class SeleccionarTrabajador extends AppCompatActivity {

    private RadioButton rbTrabajadorPorHora;
    private RadioButton rbTrabajadorTiempoCompleto;
    private Button btnSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_trabajador);

        rbTrabajadorPorHora = findViewById(R.id.rbTrabajadorPorHora);
        rbTrabajadorTiempoCompleto = findViewById(R.id.rbTrabajadorTiempoCompleto);
        btnSiguiente = findViewById(R.id.btnSiguiente);

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (rbTrabajadorPorHora.isChecked()) {
                    Intent intent = new Intent(SeleccionarTrabajador.this, TrabajadorHora.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else if (rbTrabajadorTiempoCompleto.isChecked()) {
                    Intent intent = new Intent(SeleccionarTrabajador.this, TrabajadorCompleto.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
                } else {
                }
            }
        });
    }
}
