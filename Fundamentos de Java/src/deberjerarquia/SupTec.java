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
public class SupTec extends Empleado{
    
    public SupTec(String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
    }

    public double salarioSupervisor(int anios){
        double adicional;
        if(anios  == 0){
            return salario;
        }
        else{
            adicional = salario * 0.05;
            salario +=adicional;
            return salario;
        }
    }
    //sueldo = basico mas 5% por c/anio en el trabajo

    public SupTec(double salario) {
        super(salario);
    }
}