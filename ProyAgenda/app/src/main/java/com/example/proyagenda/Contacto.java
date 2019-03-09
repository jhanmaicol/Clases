package com.example.proyagenda;

class Contacto {

    private String nombre;
    private String empresa;
    private int numero;


    public Contacto(){
    }

    public Contacto(String nombre, String empresa, int numero) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.numero = numero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


}
