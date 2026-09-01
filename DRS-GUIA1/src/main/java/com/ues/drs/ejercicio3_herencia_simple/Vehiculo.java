package com.ues.drs.ejercicio3_herencia_simple;

/*
 * Ejercicio 3: Herencia simple
 * Clase base para representar un vehiculo generico
 * Define el comportamiento comun de todos los vehiculos, como encender, apagar y detener
 * */
public class Vehiculo {
    // Estado interno protegido: accesible solo dentro de la clase y sus subclases
    protected boolean encendido;

    // Metodo para arrancar el vehiculo
    public void arrancar() {
        encendido = true;
        System.out.println("Vehiculo arrancado.");
    }

    // Metodo para detener el vehiculo
    public void detener() {
        if (encendido) {
            System.out.println("Vehiculo detenido.");
        } else {
            System.out.println("El vehiculo esta apagado.");
        }
    }

    // indica si el vehiculo esta encendido
    public boolean estaEncendido() {
        return encendido;
    }
}
