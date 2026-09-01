package com.ues.drs.ejercicio5_herencia_multiple;
/*
* Nivel 3 de la jerarquía de clases: Perro
* Hereda de Mamifero, que a su vez hereda de Animal. Esta clase representa un
* perro y puede tener comportamientos específicos de los perros.
* */
public class Perro extends Mamifero {
    // Metodo sobre
    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau. (Sobreescrito en Perro)");
    }

    // Metodo especifico de la clase Perro
    public void moverCola() {
        System.out.println("El perro mueve la cola.");
    }
}
