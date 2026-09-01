package com.ues.drs.ejercicio1_abstracion;

import java.math.BigDecimal;

/*
* Ejercicio 1: Abstraccion de datos
*
* Esta Clase representa una cuenta bancaria y oculta los detalles de implementación
* del saldo y expone solo los métodos necesarios para interactuar con la cuenta.
* mediante metodos, siguiendo el metodo de ocultacion de datos.
* */
public class CuentaBancaria {

    private BigDecimal saldo;
    private String numeroCuenta;
    private String titular;

    /*
    * Constructor inicial de la cuenta bancaria con saldo, numero de cuenta y titular
    * saldo no puede ser nullo o negativo
    * titular no puede ser nulo o vacío
    * cuenta no puede ser nula o vacía
    */
    public CuentaBancaria(BigDecimal saldo, String numeroCuenta, String titular) {
        if (saldo == null || saldo.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El saldo no puede ser nulo o negativo");
        }
        if (numeroCuenta == null || numeroCuenta.isEmpty()) {
            throw new IllegalArgumentException("El número de cuenta no puede ser nulo o vacío");
        }
        if (titular == null || titular.isEmpty()) {
            throw new IllegalArgumentException("El titular no puede ser nulo o vacío");
        }
        this.saldo = saldo;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }

    /*
    * Metodo para depositar dinero a la cuenta
    * @param cantidad La cantidad a depositar, no puede ser nula o negativa
    * @throws IllegalArgumentException si la cantidad es nula o negativa
    * */

    public void depositar(BigDecimal cantidad) {
        if (cantidad == null || cantidad.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("La cantidad a depositar no puede ser nula o negativa");
        }
        saldo = saldo.add(cantidad);
    }

    /*
    * Retirar dinero de la cuenta si hay suficiente saldo
    * @param cantidad La cantidad a retirar, no puede ser nula o negativa
    * @throws IllegalArgumentException si la cantidad es nula o negativa
    * @throws IllegalStateException si no hay suficiente saldo
    * @return true si el retiro fue exitoso, false si no hay suficiente saldo
    * */
    public boolean retirar(BigDecimal cantidad) {
        if (cantidad == null || cantidad.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("La cantidad a retirar no puede ser nula o negativa");
        }
        if (saldo.compareTo(cantidad) < 0) {
            throw new IllegalStateException("No hay suficiente saldo para realizar el retiro");
        }
        saldo = saldo.subtract(cantidad);
        return true;
    }

    /*
    * Consultar el saldo de la cuenta
    * @return El saldo actual de la cuenta
    * */
    public BigDecimal consultarSaldo() {
        return saldo;
    }

    /*
    * Obtener el número de cuenta
    * @return El número de cuenta
    * */
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    /*
    * Obtener el titular de la cuenta
    * @return El titular de la cuenta
    * */
    public String getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", titular='" + titular + '\'' +
                '}';
    }
}
