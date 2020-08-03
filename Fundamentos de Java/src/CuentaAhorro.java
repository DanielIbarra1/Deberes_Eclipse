/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;
public class CuentaAhorro extends CuentaBancaria{
    
    @Override
    public double deposito(double deposito, double monto){
        double aumento;
        if(monto < 9000){
            aumento = monto * 0.02;
            deposito += (monto + aumento);
        }
       
        return deposito;
    }
    
}