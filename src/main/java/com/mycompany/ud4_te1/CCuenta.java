package com.mycompany.ud4_te1;

public class CCuenta {

    // Atributos privados para encapsulación
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    // Constante para la comisión de retiro
    private static final double COMISION = 2.0;

    // Constructor
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    // Métodos de operación
    public double estado() {
        return getSaldo();
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa.");
        }
        setSaldo(getSaldo() + cantidad);
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa.");
        }
        if (getSaldo() < cantidad + COMISION) {
            throw new Exception("No hay suficiente saldo.");
        }
        setSaldo(getSaldo() - (cantidad + COMISION));
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
