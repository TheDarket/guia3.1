package com.example.guia3;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3.adapters.TrabajadorAdapter;
import com.example.guia3.models.Trabajador;
import com.example.guia3.TrabajadorHora;
import com.example.guia3.TrabajadorCompleto;

import java.util.ArrayList;
import java.util.List;

public class MostrarTrabajadores extends AppCompatActivity {

    private RecyclerView recyclerView;
    private TrabajadorAdapter trabajadorAdapter;
    private List<Trabajador> lstTrabajadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        //List<Trabajador> lstTrabajadoresHora = TrabajadorHora.getListaTrabajadoresHora();
        //List<Trabajador> lstTrabajadoresCompleto = TrabajadorCompleto.getListaTrabajadoresCompleto();

        // Combina ambas listas en una sola lista
        lstTrabajadores = new ArrayList<>();
        //lstTrabajadores.addAll(lstTrabajadoresHora);
        //lstTrabajadores.addAll(lstTrabajadoresCompleto);

        trabajadorAdapter = new TrabajadorAdapter((ArrayList<Trabajador>) lstTrabajadores);
        recyclerView.setAdapter(trabajadorAdapter);
    }
}
