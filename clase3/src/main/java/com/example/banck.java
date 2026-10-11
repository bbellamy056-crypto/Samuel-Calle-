package com.example;

public class banck {
    // Atributos privados
    private String Titular;
    private double Saldo;

    // Constructor
    public banck(String Titular, double SaldoInicial) {
        this.Titular = Titular;
        // Validación: Si SaldoInicial < 0, asignar 0
        if (SaldoInicial < 0) {
            this.Saldo = 0;
        } else {
            this.Saldo = SaldoInicial;
        }
    }

    // Getters y Setters
    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    // SOLO GETTER para el saldo
    public double getSaldo() {
        return Saldo;
    }

    // Método depositar
    public void depositar(double Cantidad) {
        if (Cantidad > 0) {
            this.Saldo += Cantidad;
            System.out.println("Depósito exitoso. Nuevo saldo: " + this.Saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser mayor a 0.");
        }
    }

    // Método retirar
    public void retirar(double Cantidad) {
        if (Cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser mayor a 0.");
        } else if (Cantidad > this.Saldo) {
            System.out.println("Error: Fondos insuficientes.");
        } else {
            this.Saldo -= Cantidad;
            System.out.println("Retiro exitoso. Nuevo saldo: " + this.Saldo);
        }
    }
}