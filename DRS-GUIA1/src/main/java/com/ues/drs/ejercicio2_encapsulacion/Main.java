package com.ues.drs.ejercicio2_encapsulacion;

/* Clase Main para probar la clase Empleado */

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 2: Encapsulación y control de acceso ===");

        // Crear un empleado con nombre y edad válidos
        Empleado empleado = new Empleado("Ana Lopez", 30);
        System.out.println("Empleado creado: " + empleado);

        // Intentar establecer un nombre nulo
        try {
            empleado.setNombre(null);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el nombre: " + e.getMessage());
        }

        // Intentar establecer un nombre vacío
        try {
            empleado.setNombre("");
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer el nombre: " + e.getMessage());
        }

        // Intentar establecer una edad fuera del rango permitido
        try {
            empleado.setEdad(150);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al establecer la edad: " + e.getMessage());
        }

        // Establecer un nombre y edad válidos
        empleado.setNombre("Carlos Martinez");
        empleado.setEdad(45);
        System.out.println("Empleado actualizado: " + empleado);
    }

}
