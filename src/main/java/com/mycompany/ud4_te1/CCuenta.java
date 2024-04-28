package com.mycompany.ud4_te1;

public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;


    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    public void asignarNombre(String nom) {
        setNombre(nom);
    }

    public String obtenerNombre() {
        return getNombre();
    }

    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");   
        }
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado() < cantidad + 2)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - (cantidad + 2);
    }

    public String obtenerCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double gettipoInteres() {
        return tipoInteres;
    }

    public void settipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }
}
