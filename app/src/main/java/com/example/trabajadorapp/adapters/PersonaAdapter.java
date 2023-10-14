package com.example.trabajadorapp.adapters;

import static com.example.trabajadorapp.MostrarLstTr.lstTrabajador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajadorapp.R;
import com.example.trabajadorapp.models.Persona;
import com.example.trabajadorapp.models.Trabajador;
import com.example.trabajadorapp.viewHolders.ViewHolderPersona;

import java.util.ArrayList;

public class PersonaAdapter extends RecyclerView.Adapter<ViewHolderPersona>{

    private ArrayList<Trabajador> datos;

    public PersonaAdapter(ArrayList<Trabajador> datos){
        this.datos = datos;
    }

    @NonNull
    @Override
    public ViewHolderPersona onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_persona,parent,false);
        return new ViewHolderPersona(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderPersona holder, int position) {
        holder.getNombrePersona().setText(datos.get(position).getNombrePersona());
        holder.getApellidoPersona().setText(datos.get(position).getApellidoPersona());
        holder.getEdadPersona().setText(String.valueOf(datos.get(position).getEdadPersona()));
        holder.getTt().setText(String.valueOf(datos.get(position).geTipoTrabajador()));
        holder.getSueldo().setText(String.valueOf(datos.get(position).getSueldoMensual()));
    }

    @Override
    public int getItemCount() {
        return lstTrabajador.size();
    }
}
