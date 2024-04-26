package com.example.clase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.clase.adaptador.Adaptador_usuario;
import com.example.clase.recycler.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView usuarios;

    List<Usuario> listaUsuario=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarios = findViewById(R.id.usuarios);

        Usuario usu =new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg ","Henry","Ni idea");
        Usuario usu2 =new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg  ","Marlon","Ni idea2");
        Usuario usu3 =new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg  ","pika","Ni idea3");
        Usuario usu4 =new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg  ","tus muertos","Ni idea4");

        listaUsuario.add(usu);
        listaUsuario.add(usu2);
        listaUsuario.add(usu3);
        listaUsuario.add(usu4);

       usuarios.setLayoutManager(new LinearLayoutManager(this));
       usuarios.setAdapter(new Adaptador_usuario(listaUsuario));
    }
}