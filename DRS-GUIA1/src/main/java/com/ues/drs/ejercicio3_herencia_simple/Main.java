package com.ues.drs.ejercicio3_herencia_simple;

/*
* Clase principal para probar el ejercicio de herencia simple
* Crea un objeto de la clase Coche y demuestra el uso de metodos heredados
* */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 3: Herencia simple ===");

        Coche miCoche = new Coche();

        // Usar metodos heredados de la clase base Vehiculo
        miCoche.arrancar(); // Metodo heredado de Vehiculo
        System.out.println("El coche esta encendido: " + miCoche.estaEncendido());

        miCoche.detener();  // Metodo heredado de Vehiculo
        System.out.println("El estado del coche esta encendido: " + miCoche.estaEncendido());

        // intentar conducir con el coche
        miCoche.conducir(); // Metodo especifico de Coche

        // Demostrar polimorfismo: usar una referencia de tipo Vehiculo para un objeto Coche
        Vehiculo vehiculo   = new Coche();
        vehiculo.arrancar();
        vehiculo.detener();
    }
}
