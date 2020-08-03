/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;

/**
 *
 * @author destock
 */
public class Main {
     public static void main(String[] args) {
   
        CuentaBancaria Cuenta1 = new CuentaBancaria();
        CuentaBancaria Cuenta2 = new CuentaCorriente();
        CuentaAhorro Cuenta3 = new CuentaAhorro();
        
        System.out.println(Cuenta2.deposito(75000,71000));
        System.out.println(Cuenta3.deposito(75000,1900));
        
        
        
    }
}
