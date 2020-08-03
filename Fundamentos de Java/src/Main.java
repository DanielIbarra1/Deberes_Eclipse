/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author destock 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CBancaria CuentaBanco = new CBancaria();
        CBancaria CuentaAhorro = new CBancaria();
        CBancaria CuentaCorriente = new CBancaria();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su tipo de cuenta bancaria");
        String tipoDeCuenta = sc.nextLine().toUpperCase();

        switch (tipoDeCuenta) {
            case "CuentaCorriente":
                System.out.println("Ingrese sus nombres completos :");
                CuentaCorriente.setNombre(sc.nextLine().toUpperCase());
                System.out.println("ingrese su saldo :$");
                CuentaCorriente.setSaldo(Double.parseDouble(sc.nextLine()));
                if (CuentaCorriente.getSaldo() <= 1000) {
                    
                    CuentaCorriente.setSaldo(CuentaCorriente.getSaldo() * 1.01);
                    
                    System.out.println("Estimado cliente " + CuentaCorriente.getNombre()
                            + " usted ha recibido un aumento del 1 % su saldo actual CC es de $"
                            + CuentaCorriente.getSaldo());
                    
                } else {
                    System.out.println("Estimado  " + CuentaCorriente.getNombre() + " dispone de un saldo actual de  $ "
                            + CuentaCorriente.getSaldo());
                    
                }   break;
            case "CUENTA_AHORRO":
                System.out.println("Ingrese sus nombres completos :");
                CuentaAhorro.setNombre(sc.nextLine().toUpperCase());
                System.out.println("ingrese su saldo :$");
                CuentaAhorro.setSaldo(Double.parseDouble(sc.nextLine()));
                System.out.println("Estimado  " + CuentaAhorro.getNombre() + " su saldo actual de CA es de  $ "
                        + CuentaAhorro.getSaldo());
                break;
            default:
                System.out.println("USTED DEBE DE INGRESAR UN CC O CA");
                break;
        }
    }


}
