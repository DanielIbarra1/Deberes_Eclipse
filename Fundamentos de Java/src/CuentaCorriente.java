/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra;
public class CuentaCorriente extends CuentaBancaria{
    
    @Override
    public double deposito(double deposito, double monto){
        double aumento;
        if(monto <= 9000){
            aumento = monto *0.01;
            deposito += (monto + aumento);
        }
        
        return deposito;
    }

    boolean deposito(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}