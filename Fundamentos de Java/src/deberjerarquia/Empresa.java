/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deberjerarquia;

/**
 *
 * @author destock
 */
import java.util.ArrayList;


public class Empresa {
    private ArrayList<Empleado> empleados = new ArrayList<>();
    
    public void contratar(Empleado empleado){
        empleados.add(empleado);
    }
    
    
    public double diaDePago(){
        double sueldosTotales = 0;
        
        return sueldosTotales;
    }
}