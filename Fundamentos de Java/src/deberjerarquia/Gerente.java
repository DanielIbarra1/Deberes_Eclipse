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
public class Gerente extends Empleado{

    public Gerente(String nombresYapellidos, double cedula) {
        super(nombresYapellidos, cedula);
    }

    public Gerente(double salario) {
        super(salario);
    }

    public double salarioGerente(double viaticosPersonales, int anios){
        double adicional;
        if(anios  == 0){
            return salario;
        }
        else{
            adicional = salario * 0.05;
            salario +=adicional+viaticosPersonales;
            return salario;
        }
        
    }
    
}