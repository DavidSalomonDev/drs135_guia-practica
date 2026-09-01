package com.ues.drs.ejercicio3_herencia_simple;

public class Coche extends Vehiculo {

    /*
    * Conduce el coche si esta encendido
    * Demuestra el uso de atributos y metodos heredados de la clase base Vehiculo
    * */

    public void conducir() {
        if (estaEncendido()) {
            System.out.println("Conduciendo el coche...");
        } else {
            System.out.println("No se puede conducir. El coche esta apagado.");
        }
    }
}
