package com.mycompany.ud4_te1;

/**
 * Clase que representa una cuenta bancaria.
 * 
 * @author Joseph Gelrud
 * @version 1.0
 */
public class CCuenta {

    // Atributos privados para encapsulación
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    // Constante para la comisión de retiro
    private static final double COMISION = 2.0;

    /**
     * Constructor de la clase.
     * 
     * @param nombre      nombre del titular de la cuenta
     * @param cuenta      número de cuenta
     * @param saldo       saldo inicial
     * @param tipoInteres tipo de interés
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInteres) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método para obtener el nombre del titular de la cuenta.
     * 
     * @return nombre del titular de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método para establecer el nombre del titular de la cuenta.
     * 
     * @param nombre nombre del titular de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método para obtener el número de cuenta.
     * 
     * @return número de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Método para establecer el número de cuenta.
     * 
     * @param cuenta número de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Método para obtener el saldo de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Método para establecer el saldo de la cuenta.
     * 
     * @param saldo saldo de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Método para obtener el tipo de interés.
     * 
     * @return tipo de interés
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * Método para establecer el tipo de interés.
     * 
     * @param tipoInteres tipo de interés
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * Método para obtener el estado de la cuenta.
     * 
     * @return saldo de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Método para ingresar una cantidad a la cuenta.
     * 
     * @param cantidad cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa.");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de la cuenta.
     * 
     * @param cantidad cantidad a retirar
     * @throws Exception si la cantidad es negativa o si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa.");
        }
        if (getSaldo() < cantidad + COMISION) {
            throw new Exception("No hay suficiente saldo.");
        }
        setSaldo(getSaldo() - (cantidad + COMISION));
    }

}
