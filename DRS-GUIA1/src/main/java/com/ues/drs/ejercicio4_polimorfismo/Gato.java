package com.ues.drs.ejercicio4_polimorfismo;

public class  Gato extends Animal {

    /*
    * Repreentacion de un gato, que es un tipo de animal. Esta clase
    * extiende la clase abstracta Animal y proporciona una implementación específica del metodo hacerSonido().
    */

    @Override
    public void hacerSonido() {
        System.out.println("El gato hace miau.");
    }
}
