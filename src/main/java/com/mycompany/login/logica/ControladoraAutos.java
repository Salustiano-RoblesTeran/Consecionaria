/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.login.logica;

import com.mycompany.login.persistencia.ControladoraPersistenciaAutos;
import java.util.List;

/**
 *
 * @author salu
 */
public class ControladoraAutos {
        ControladoraPersistenciaAutos controlPersis = new ControladoraPersistenciaAutos();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
       
        controlPersis.agregarAutomovil(auto);
    }

    public List<Automovil> traerAutos() {
            return controlPersis.traerAutos();
             
    }

    public void borrarAuto(int idAuto) {
        controlPersis.borrarAuto(idAuto);
    }
    
    public Automovil traerAuto(int idAuto) {
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String color, String motor, String patente, int cantPuertas) {
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        // Le pido a la persistencia que modifique
        controlPersis.modificarAuto(auto);
    }
    
}
