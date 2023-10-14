package com.example.guia3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.guia3.R;
import com.example.guia3.models.Persona;
import com.example.guia3.viewHolders.ElementoViewHolder;

import java.util.ArrayList;
public class PersonaAdapter extends RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder> {
    private final ArrayList<Persona> datos;
    public PersonaAdapter(ArrayList<Persona> datos) {
        this.datos = datos;
    }
    @NonNull
    @Override
    public PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona, parent, false);
        return new PersonaViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull PersonaViewHolder holder, int position) {
        Persona persona = datos.get(position);
        holder.bind(persona);
    }
    @Override
    public int getItemCount() {
        return datos.size();
    }
    public static class PersonaViewHolder extends RecyclerView.ViewHolder {
        private final TextView codigoPersonaTextView;
        private final TextView nombrePersonaTextView;
        private final TextView apellidoPersonaTextView;

        public PersonaViewHolder(@NonNull View itemView) {
            super(itemView);
            codigoPersonaTextView = itemView.findViewById(R.id.tvCodigoPersona);
            nombrePersonaTextView = itemView.findViewById(R.id.tvNombrePersona);
            apellidoPersonaTextView = itemView.findViewById(R.id.tvApellidoPersona);
        }
        public void bind(Persona persona) {
            codigoPersonaTextView.setText(persona.getCodigoPersona());
            nombrePersonaTextView.setText(persona.getNombrePersona());
            apellidoPersonaTextView.setText(persona.getApellidoPersona());
        }

    }
}

