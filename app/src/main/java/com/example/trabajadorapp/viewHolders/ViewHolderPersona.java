package com.example.trabajadorapp.viewHolders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.trabajadorapp.R;

public class ViewHolderPersona extends RecyclerView.ViewHolder{

    private TextView nombrePersona;
    private TextView apellidoPersona;
    private TextView edadPersona;
    private TextView tt;
    private TextView Sueldo;

    private TextView Tp;
    public ViewHolderPersona(@NonNull View itemView) {
        super(itemView);
        this.nombrePersona = itemView.findViewById(R.id.txvNombreComp);
        this.apellidoPersona = itemView.findViewById(R.id.txvApellidoPersona);
        this.edadPersona = itemView.findViewById(R.id.txvEdadPersona);
        this.tt = itemView.findViewById(R.id.txvTTPersona);
        this.Sueldo = itemView.findViewById(R.id.txvSueldoPersona);
    }

    public TextView getNombrePersona(){
        return this.nombrePersona;
    }

    public TextView getApellidoPersona(){return  this.apellidoPersona;}

    public TextView getEdadPersona(){
        return this.edadPersona;
    }
    public TextView getTt(){return this.tt;}
    public TextView getSueldo(){return this.Sueldo;}
}
