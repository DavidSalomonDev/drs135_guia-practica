package com.ues.drs.ejercicio5_herencia_multiple;

/*
 * Ejercicio 5: Herencia múltiple y sobreescritura de métodos
 * Nivel 1 de la jerarquía de clases: Animal
 * Define el compartamiento mas general de los animales, que es la clase base para todas las demás clases.
 */

public class Animal {

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }

    public void respirar() {
        System.out.println("El animal está respirando.");
    }
}
