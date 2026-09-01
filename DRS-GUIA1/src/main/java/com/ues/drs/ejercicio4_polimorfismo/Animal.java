package com.ues.drs.ejercicio4_polimorfismo;

/*
* Ejercicio 4: Polimorfismo
* Clase abstracta Animal que representa un animal genérico.
* No puede instanciarse directamente, pero puede ser extendida por otras clases.
* El metodo hacerSonido() es un ejemplo de polimorfismo, ya que puede ser sobrescrito
*  por las clases hijas para proporcionar un comportamiento específico.
* */
public abstract class Animal {
    /*
    * Metodo abstracto que debe ser implementado por las clases hijas para hacer un sonido específico.
    */
    public abstract void hacerSonido();

    /*
    * Metodo comun para todos los animales
    */

    public void dormir() {
        System.out.println("El animal está durmiendo.");
    }
}
