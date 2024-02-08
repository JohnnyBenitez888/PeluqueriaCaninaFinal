package com.todocode.ap.peluqueriacanina.logica;

import com.todocode.ap.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;

public class Controladora {

    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nMascota, String raza, String color, String observa, String alergico, String ateEspe,
             String nDuenio, String tel) {

        //primero creamos el duenio ya que mascota necesita un duenio
        Duenio duenio = new Duenio();
        duenio.setNombre(nDuenio);
        duenio.setTelefono(tel);

        Mascota mascota = new Mascota();
        mascota.setNombre(nMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtenEspecial(ateEspe);
        mascota.setObservacion(observa);
        mascota.setDuenio(duenio);

        controlPersis.guardar(duenio, mascota);
    }

    public List<Mascota> traerMascotas() {
        return controlPersis.traerMascotas();
    }

    public void eliminarDato(int id) {
        controlPersis.eliminarDato(id);
    }

    public Mascota traerDato(int idMascota) {
        return controlPersis.traerMascota(idMascota);
    }

    public void editarMascota(Mascota masco, String nameMascota, String raza, String color, String observa, String alergico, String ateEspe,
            String nameDuenio, String tel) {

        //Setear mascota
        masco.setNombre(nameMascota);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtenEspecial(ateEspe);
        masco.setObservacion(observa);

        controlPersis.editarMascota(masco);

        //crear duenio 
        Duenio duenio = this.buscarDuenio(masco.getDuenio().getIdDuenio());//busco al duenio
        duenio.setNombre(nameDuenio);
        duenio.setTelefono(tel);

        //Modifico al duenio
        this.modificarDuenio(duenio);
    }

    private Duenio buscarDuenio(int idDuenio) {
        return controlPersis.traerDuenio(idDuenio);
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }

}
