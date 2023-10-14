package com.example.guia3.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3.R;
import com.example.guia3.models.Persona;
import com.example.guia3.models.Trabajador;

public class ElementoViewHolder extends RecyclerView.ViewHolder {

    private final TextView codigoTextView;
    private TextView nombreTextView;
    private final TextView apellidoTextView;
    //private TextView codigoTextView;
    private final TextView salarioTextView;

    public ElementoViewHolder(@NonNull View itemView) {
        super(itemView);

        //nombreTextView = itemView.findViewById(R.id.tvNombre);
        nombreTextView = itemView.findViewById(R.id.tvNombrePersona);
        apellidoTextView = itemView.findViewById(R.id.tvApellidoPersona);
        codigoTextView = itemView.findViewById(R.id.tvCodigoPersona);
        salarioTextView = itemView.findViewById(R.id.tvSalario);
        TextView tipoTextView = itemView.findViewById(R.id.tvTipo);
    }
    public void bind(Object elemento) {

        if (elemento instanceof Persona) {
            Persona persona = (Persona) elemento;
            nombreTextView.setText(persona.getNombrePersona());
            apellidoTextView.setText(persona.getApellidoPersona());
            codigoTextView.setText(persona.getCodigoPersona());
            salarioTextView.setVisibility(View.GONE);
        } else if (elemento instanceof Trabajador) {
            Trabajador trabajador = (Trabajador) elemento;
            nombreTextView.setText(trabajador.getNombrePersona());
            //apellidoTextView.setText(trabajador.getApellido());
            //tipoTextView.setText(trabajador.getTipoTrabajador());
            salarioTextView.setText(String.valueOf(trabajador.getSueldoMensual()));
        }
    }
}
