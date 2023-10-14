package com.example.guia3.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3.R;
import com.example.guia3.models.Trabajador;
//import com.example.guia3.viewHolders.ElementoViewHolder;

import java.util.ArrayList;

public class TrabajadorAdapter extends RecyclerView.Adapter<TrabajadorAdapter.TrabajadorViewHolder> {
    private final ArrayList<Trabajador> datos;
    public TrabajadorAdapter(ArrayList<Trabajador> datos) {
        this.datos = datos;
    }

    public static void add(Trabajador trabajador) {
    }

    @NonNull
    @Override
    public TrabajadorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_trabajador, parent, false);
        return new TrabajadorViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull TrabajadorViewHolder holder, int position) {
        Trabajador trabajador = datos.get(position);
        holder.bind(trabajador);
    }
    @Override
    public int getItemCount() {

        return datos.size();
    }
    public static class TrabajadorViewHolder extends RecyclerView.ViewHolder {
        private final TextView nombreTextView;
        private final TextView salarioTextView;
        private final TextView tipoTextView;

        public TrabajadorViewHolder(@NonNull View itemView) {
            super(itemView);
            nombreTextView = itemView.findViewById(R.id.tvNombre);
            salarioTextView = itemView.findViewById(R.id.tvSalario);
            tipoTextView = itemView.findViewById(R.id.tvTipo);
        }
        public void bind(Trabajador trabajador) {
            nombreTextView.setText(trabajador.getNombrePersona());
            salarioTextView.setText(String.valueOf(trabajador.getSueldoMensual()));
            tipoTextView.setText(String.valueOf(trabajador.getTipoTrabajador()));
        }
    }
}




