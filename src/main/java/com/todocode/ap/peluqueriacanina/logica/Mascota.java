package com.todocode.ap.peluqueriacanina.logica;


public class Mascota {

    //Atributos
    private int IdCliente;
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atenEspecial;
    private String observacion;
    
    private Duenio duenio;

    //Constructores
    public Mascota() {
    }

    public Mascota(String nombre, String raza, String color, String alergico, String atenEspecial, String observacion, Duenio duenio) {
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atenEspecial = atenEspecial;
        this.observacion = observacion;
        this.duenio = duenio;
    }

    public Mascota(int IdCliente, String nombre, String raza, String color, String alergico, String atenEspecial, String observacion, Duenio duenio) {
        this.IdCliente = IdCliente;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atenEspecial = atenEspecial;
        this.observacion = observacion;
        this.duenio = duenio;
    }

    //GET and SET
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String isAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String isAtenEspecial() {
        return atenEspecial;
    }

    public void setAtenEspecial(String atenEspecial) {
        this.atenEspecial = atenEspecial;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public Duenio getDuenio() {
        return duenio;
    }

    public void setDuenio(Duenio duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "IdCliente=" + IdCliente + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + ", alergico=" + alergico + ", atenEspecial=" + atenEspecial + ", observacion=" + observacion + ", duenio=" + duenio + '}';
    }

}
