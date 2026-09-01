package com.ues.drs.ejercicio1_abstracion;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        // Crear una cuenta bancaria con saldo inicial, número de cuenta y titular
        CuentaBancaria cuenta = new CuentaBancaria(new BigDecimal("1000.00"), "123456789", "Juan Perez");

        System.out.println("=== Ejercicio 1: Abstracción de datos ===");
        System.out.println("Cuenta creada para el titular: " + cuenta.getTitular() + ", Número de cuenta: " + cuenta.getNumeroCuenta());

        // Mostrar el saldo inicial
        System.out.println("Saldo inicial: " + cuenta.consultarSaldo());

        // Depositar dinero en la cuenta
        cuenta.depositar(new BigDecimal("500.00"));
        System.out.println("Saldo después del depósito: " + cuenta.consultarSaldo());

        // Retirar dinero de la cuenta
        boolean retiroExitoso = cuenta.retirar(new BigDecimal("200.00"));
        // saldo antes del retiro para mejorar la salida
        System.out.println("Saldo antes del retiro: " + cuenta.consultarSaldo());
        if (retiroExitoso) {
            System.out.println("Saldo después del retiro: " + cuenta.consultarSaldo());
        } else {
            System.out.println("No hay suficiente saldo para realizar el retiro.");
        }

        // Intentar retirar una cantidad mayor al saldo disponible
        boolean retiroFallido = cuenta.retirar(new BigDecimal("5000.00"));
        System.out.println("Retiro de 5000.00 exitoso: " + retiroFallido);
        System.out.println("Saldo final: " + cuenta.consultarSaldo());


    }

}
