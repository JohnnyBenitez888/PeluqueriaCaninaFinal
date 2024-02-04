package com.todocode.ap.peluqueriacanina.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Duenio implements Serializable {

    //Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idDuenio;
    @Basic
    private String nombre;
    private String telefono;

    //Constructores
    public Duenio() {
    }

    public Duenio(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Duenio(int idDuenio, String nombre, String celular) {
        this.idDuenio = idDuenio;
        this.nombre = nombre;
        this.telefono = celular;
    }

    //GET and SET
    public int getIdDuenio() {
        return idDuenio;
    }

    public void setIdDuenio(int idDuenio) {
        this.idDuenio = idDuenio;
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

    //toString
    @Override
    public String toString() {
        return "Duenio{" + "idDuenio=" + idDuenio + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

}
