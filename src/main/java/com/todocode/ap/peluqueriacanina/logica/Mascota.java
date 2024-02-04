package com.todocode.ap.peluqueriacanina.logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Mascota {

    //Atributos
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int IdCliente;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atenEspecial;
    private String observacion;
    @OneToOne
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
