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
public class CuentaBancaria {
     protected String propietario;
    protected double saldo;
    //protected double monto;

    public String getPropietario() {
        return propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public double deposito(double deposito, double monto){
        deposito+=monto;
        return deposito;
    }
    
    public double retiro(double monto){
        saldo-=monto;
        return saldo;
    }
    
}
