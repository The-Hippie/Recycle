package com.example.clase.adaptador;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clase.R;
import com.example.clase.recycler.Usuario;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Adaptador_usuario extends RecyclerView.Adapter<Adaptador_usuario.ViewHolder> {

    private List<Usuario> datos;

    public Adaptador_usuario(List<Usuario> datos){
        this.datos=datos;
    }

    @NonNull
    @Override
    public Adaptador_usuario.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_usuario,parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador_usuario.ViewHolder holder, int position) {
       Usuario dato=datos.get(position);
       holder.bind(dato);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
  public static class ViewHolder extends RecyclerView.ViewHolder{
      TextView txt_nombre_usuario, txt_curso;
      ImageView imag_usuario;

      public ViewHolder(@NonNull View itemView) {
          super(itemView);
          txt_nombre_usuario=itemView.findViewById(R.id.txt_nombre_usuario);
          txt_curso=itemView.findViewById(R.id.txt_curso);
          imag_usuario=itemView.findViewById(R.id.img_usuario);
      }
      public void bind(Usuario dato){
          txt_nombre_usuario.setText(dato.getNombre());
          txt_curso.setText(dato.getCusro());
          //imagen
          Picasso.get().load(dato.getImagen()).into(imag_usuario);
      }
  }

}
