package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.guia3.adapters.PersonaAdapter;
import com.example.guia3.adapters.TrabajadorAdapter;
import com.example.guia3.models.Persona;
import com.example.guia3.models.Trabajador;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    protected TrabajadorAdapter trabajadorAdapter;
    protected PersonaAdapter personaAdapter;
    private RecyclerView recyclerView;
    private LinearLayoutManager layoutManager;

    public ArrayList<Persona> lstPersonas = new ArrayList<>();
    public ArrayList<Trabajador> lstTrabajadores = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstPersonas = new ArrayList<>();
        lstTrabajadores = new ArrayList<>();

        lstPersonas.add(new Persona("001", "Juan", "Perez"));
        lstPersonas.add(new Persona("002", "Carlos", "Guerra"));

        lstTrabajadores.add(new Trabajador("01", "Javier Garcia", "$985", 596.0f, 0.0f, 0.0f, 0.0f) {
            public int getTipoTrabajador() {
                return 1;
            }
        });
        lstTrabajadores.add(new Trabajador("03", "Estarlyn Morales", "$963", 390.0f, 0.0f, 0.0f, 0.0f) {
            public int getTipoTrabajador() {
                return 2;
            }
        });
        Toast.makeText(this, "DATOS: " + lstPersonas,
                Toast.LENGTH_SHORT).show();

        Toast.makeText(this, "DATOS: " + lstTrabajadores,
                Toast.LENGTH_SHORT).show();

        RecyclerView recyclerViewPersonas = findViewById(R.id.rcvPersonas);
        RecyclerView recyclerViewTrabajadores = findViewById(R.id.rcvTrabajadores);

        personaAdapter = new PersonaAdapter(lstPersonas);
        trabajadorAdapter = new TrabajadorAdapter(lstTrabajadores);

        recyclerViewPersonas.setAdapter(personaAdapter);
        recyclerViewTrabajadores.setAdapter(trabajadorAdapter);

        recyclerViewPersonas.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewTrabajadores.setLayoutManager(new LinearLayoutManager(this));
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        lstPersonas.clear();
        lstTrabajadores.clear();
    }
}
