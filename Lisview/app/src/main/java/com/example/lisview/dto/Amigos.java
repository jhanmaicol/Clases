package com.example.lisview.dto;

public class Amigos {
    private Integer foto;
    private String nombre;
    private String correo;

    public Amigos() {
    }

    public Amigos(Integer foto, String nombre, String correo) {
        this.foto = foto;
        this.nombre = nombre;
        this.correo = correo;
    }

    public Integer getFoto() {
        return foto;
    }

    public void setFoto(Integer foto) {
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
