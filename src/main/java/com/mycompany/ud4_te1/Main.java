package com.mycompany.ud4_te1;

public class Main {

    public static void main(String[] args) {
        CCuenta cuentaTrabajo = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        operativaCuenta(cuentaTrabajo);
    }

    public static void operativaCuenta(CCuenta cuenta) {
        double saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            System.out.println("Cargo en cuenta");
            cuenta.retirar(2300);
            System.out.println("El nuevo saldo es: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }
        
        try {
            System.out.println("Abono en cuenta");
            cuenta.ingresar(695);
            System.out.println("El nuevo saldo es: " + cuenta.estado());
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }
    }
}
