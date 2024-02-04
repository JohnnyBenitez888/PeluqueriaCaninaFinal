package com.todocode.ap.peluqueriacanina.persistencia;

import com.todocode.ap.peluqueriacanina.logica.Duenio;
import com.todocode.ap.peluqueriacanina.logica.Mascota;

public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota mascota) {
        //primero crear el duenio
        duenioJpa.create(duenio);
        //segundo crear la mascota asociada con el duenio
        mascotaJpa.create(mascota);
    }

    
    
    
    
    
}
