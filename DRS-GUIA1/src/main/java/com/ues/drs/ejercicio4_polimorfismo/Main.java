package com.ues.drs.ejercicio4_polimorfismo;

/*
* Clase principal para ejecutar el ejercicio 4: Polimorfismo.
*
* Demuestra como una referencia de tipo Animal (Base) puede invocar
* metodos de las clases derivadas (Gato y Perro) a traves del polimorfismo.
*
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("Ejercicio 4: Polimorfismo");
        Animal perro = new Perro();
        Animal gato = new Gato();

        // Invocando el metodo hacerSonido() de cada animal
        System.out.println("Perro:");
        perro.hacerSonido(); // Salida: El perro hace guau.

        System.out.println("Gato:");
        gato.hacerSonido();  // Salida: El gato hace miau.

        // usar metodos polimorficos con diferentes animales
        System.out.println("Demostrando polimorfismo con un metodo que acepta Animal:");
        emetirSonido(perro); // Salida: El perro hace guau.
        emetirSonido(gato);  // Salida: El gato hace miau

        // Arreglo de animales para demostrar polimorfismo en un bucle
        System.out.println("Demostrando polimorfismo con un arreglo de animales:");
        Animal[] animales = {perro, gato, gato};
        for (Animal animal : animales) {
            animal.hacerSonido(); // Salida: El perro hace guau. / El gato hace miau.
        }


    }
    /*
    * Metodo que acepta un objeto de tipo Animal y llama a su metodo hacerSonido().
    * Esto demuestra el polimorfismo, ya que el metodo hacerSonido() se comporta de
    * manera diferente dependiendo del tipo real del objeto (Perro o Gato).
    */
    public static void emetirSonido(Animal animal) {
        System.out.println("El animal hace el siguiente sonido:");
        animal.hacerSonido();
    }


}
