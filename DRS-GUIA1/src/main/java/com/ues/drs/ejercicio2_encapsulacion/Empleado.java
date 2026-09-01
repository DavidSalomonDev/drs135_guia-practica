package com.ues.drs.ejercicio2_encapsulacion;

public class Empleado {
    /*
    * Ejercicio 2: Encapsulación y control de acceso
    * Esta clase demuestra el uso de encapsulacion y proteccion de los atributos
    * internos (nombre, edad) y el control de acceso a los mismos mediante metodos publicos (getters y setters)
    * la edad incluye validacion de rango de edad (0-120) y el nombre no puede ser nulo o vacío
    * para proteger la integridad de los datos y evitar errores de negocio.
    * */

    private String nombre;
    private int edad;

    //constantes para validacion de edad
    private static final int EDAD_MINIMA = 1;
    private static final int EDAD_MAXIMA = 120;

    /*
    * Constructor inicial de la clase Empleado
    * @param nombre Nombre del empleado (no puede ser nulo o vacío)
    * @param edad Edad del empleado (entre 1 y 120)
    */

    public Empleado(String nombre, int edad) {
        setNombre(nombre);
        setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < EDAD_MINIMA || edad > EDAD_MAXIMA) {
            throw new IllegalArgumentException("La edad debe estar entre " + EDAD_MINIMA + " y " + EDAD_MAXIMA + ".");
        }
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
