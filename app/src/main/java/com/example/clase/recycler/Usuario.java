package com.example.clase.recycler;

public class Usuario {
    private String imagen;
    private String nombre;
    private String cusro;

    public Usuario(String imagen, String nombre, String cusro) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.cusro = cusro;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCusro() {
        return cusro;
    }

    public void setCusro(String cusro) {
        this.cusro = cusro;
    }
}
