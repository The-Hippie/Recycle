package com.example.clase;


import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.clase.adaptador.Adaptador_usuario;
import com.example.clase.recycler.Usuario;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    RecyclerView usuarios;
    List<Usuario> listaUsuario = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuarios = findViewById(R.id.usuarios);

        Usuario usu = new Usuario("https://rickandmortyapi.com/api/character/avatar/120.jpeg", "Henry", "Ni idea");
        Usuario usu2 = new Usuario("https://rickandmortyapi.com/api/character/avatar/72.jpeg", "Marlon", "Ni idea2");
        Usuario usu3 = new Usuario("https://rickandmortyapi.com/api/character/avatar/190.jpeg", "pika", "Ni idea3");
        Usuario usu4 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg", "tus muertos", "Ni idea4");
        Usuario usu5 = new Usuario("https://rickandmortyapi.com/api/character/avatar/241.jpeg", "tus muertos", "Ni idea4");
        Usuario usu6 = new Usuario("https://www.las2orillas.co/wp-content/uploads/2023/08/bmw-carro-nuevo.jpg", "BMW", "Wagon");
        Usuario usu7 = new Usuario("https://img.remediosdigitales.com/1b793d/591aac361b16b/840_560.jpeg", "Toyota", "MK4");
        Usuario usu8 = new Usuario("https://loscoches.com/wp-content/uploads/2021/04/carros-deportivos-potencia.jpg", "Ford", "Mustang");

        listaUsuario.add(usu);
        listaUsuario.add(usu2);
        listaUsuario.add(usu3);
        listaUsuario.add(usu4);
        listaUsuario.add(usu5);
        listaUsuario.add(usu6);
        listaUsuario.add(usu7);
        listaUsuario.add(usu8);

        usuarios.setLayoutManager(new LinearLayoutManager(this));
        usuarios.setAdapter(new Adaptador_usuario(listaUsuario));

}
}