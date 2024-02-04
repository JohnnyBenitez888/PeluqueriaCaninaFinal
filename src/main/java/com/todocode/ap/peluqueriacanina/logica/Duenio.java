package com.todocode.ap.peluqueriacanina.logica;



public class Duenio {
    //Atributos
    private int IdDuenio;
    private String nombre;
    private String telefono;

    //Constructores
    public Duenio() {
    }

    public Duenio(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Duenio(int IdDuenio, String nombre, String telefono) {
        this.IdDuenio = IdDuenio;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    //GET and SET

    public int getIdDuenio() {
        return IdDuenio;
    }

    public void setIdDuenio(int IdDuenio) {
        this.IdDuenio = IdDuenio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Duenio{" + "IdDuenio=" + IdDuenio + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
