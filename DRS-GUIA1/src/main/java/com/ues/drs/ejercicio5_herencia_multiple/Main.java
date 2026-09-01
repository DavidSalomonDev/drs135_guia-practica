package com.ues.drs.ejercicio5_herencia_multiple;

/*
 * Clase principal para ejecutar el ejercicio 5: herencia múltiple y sobreescritura de métodos.
 * Demuestra como Perro hereda metodos tanto de Mamifero como de Animal,
 *  y como se puede sobreescribir el metodo funciona atraves de multiples niveles.
 *
 */
public class Main {
    public static void main(String[] args) {
        // Código de prueba para herencia múltiple
        System.out.println("=== Ejercicio 5: Herencia múltiple ===");

        // Crear un objeto de tipo Perro
        Perro miPerro = new Perro();

        // Metodos sobreescritos y heredados en perro
        System.out.println("Desde referencia Perro:");
        miPerro.hacerSonido();
        miPerro.alimentar();
        miPerro.moverCola();

        // Crear un objeto de tipo Mamifero
        Mamifero miMamifero = miPerro; // Referencia de tipo Mamifero apuntando a un objeto Perro
        System.out.println("\nDesde referencia Mamifero:");
        miMamifero.hacerSonido();
        miMamifero.alimentar();
        // miMamifero.moverCola(); // Esto no es posible, ya que moverCola() es específico de Perro

        // Crear un objeto de tipo Animal
        Animal miAnimal = miPerro; // Referencia de tipo Animal apuntando a un objeto Perro
        System.out.println("\nDesde referencia Animal:");
        miAnimal.hacerSonido();
        miAnimal.respirar();
        // miAnimal.alimentar(); // Esto no es posible, ya que alimentar() es específico de Mamifero
        // miAnimal.moverCola(); // Esto no es posible, ya que moverCola() es específico de Perro


    }
}
