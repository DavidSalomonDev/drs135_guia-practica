package com.ues.drs.ejercicio4_polimorfismo;

public class Perro extends Animal {

    /*
    * Representacion de un perro, que es un tipo de animal. Esta clase
    * extiende la clase abstracta Animal y proporciona una implementación específica del metodo hacerSonido().
    */

    @Override
    public void hacerSonido() {
        System.out.println("El perro hace guau.");
    }
}
