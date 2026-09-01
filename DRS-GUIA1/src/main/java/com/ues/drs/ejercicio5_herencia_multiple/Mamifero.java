package com.ues.drs.ejercicio5_herencia_multiple;

/*
* Nivel 2 de la jerarquía de clases: Mamifero
* Hereda de Animal. Esta clase representa un mamífero y puede tener comportamientos específicos de los mamíferos.
*/
public class Mamifero extends Animal {

    /*
     * Representacion de un mamifero, que es un tipo de animal. Esta clase
     * extiende la clase Animal y proporciona una implementación específica del metodo hacerSonido().
     */

    @Override
    public void hacerSonido() {
        System.out.println("El mamífero hace un sonido (Sobreescrito en Mamifero).");
    }

    public void alimentar() {
        System.out.println("El mamífero se alimenta de leche materna.");
    }

}
