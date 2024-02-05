package com.todocode.ap.peluqueriacanina.logica;

import com.todocode.ap.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void guardar(String nMascota, String raza, String color, String observa, String alergico, String ateEspe
    , String nDuenio, String tel){
        
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
    
    public List<Mascota> traerMascotas(){
        return controlPersis.traerMascotas();
    }
    
    public void eliminarDato(int id){
        controlPersis.eliminarDato(id);
    }
}
