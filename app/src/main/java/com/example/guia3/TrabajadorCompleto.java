package com.example.guia3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3.adapters.TrabajadorAdapter;
import com.example.guia3.models.Trabajador;

import java.util.ArrayList;
import java.util.List;

public class TrabajadorCompleto extends AppCompatActivity {

    private EditText editTextID;
    private EditText editTextNombre;
    private EditText editTextApellido;
    private EditText editTextEdad;
    private EditText editTextSalario;
    private Button btnRegistrar;
    private RecyclerView recyclerView;
    private TrabajadorAdapter adapter;
    private List<Trabajador> datos = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajador_completo);

        editTextID = findViewById(R.id.editTextID);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextApellido = findViewById(R.id.editTextApellido);
        editTextEdad = findViewById(R.id.editTextEdad);
        editTextSalario = findViewById(R.id.editTextSalario);
        btnRegistrar = findViewById(R.id.btnRegistrar);
        recyclerView = findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new TrabajadorAdapter((ArrayList<Trabajador>) datos);
        recyclerView.setAdapter(adapter);

        btnRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String id = editTextID.getText().toString();
                String nombre = editTextNombre.getText().toString();
                String apellido = editTextApellido.getText().toString();
                String edad = editTextEdad.getText().toString();
                String salario = editTextSalario.getText().toString();
                float sueldoMensual = Float.parseFloat(salario);
                float descuentoISR = 0.0f;
                float totalDescuentos = 0.0f;
                float totalPagar = 0.0f;

                if (!id.isEmpty() && !nombre.isEmpty() && !apellido.isEmpty() && !edad.isEmpty() && !salario.isEmpty()) {

                    Trabajador trabajador = new Trabajador(id, nombre, apellido, sueldoMensual, descuentoISR, totalDescuentos, totalPagar) {
                        @Override
                        public int getTipoTrabajador() {
                            return 0;
                        }
                    };
                    datos.add(trabajador);
                    adapter.notifyDataSetChanged();
                    editTextID.setText("");
                    editTextNombre.setText("");
                    editTextApellido.setText("");
                    editTextEdad.setText("");
                    editTextSalario.setText("");
                }
            }
        });
    }
}
