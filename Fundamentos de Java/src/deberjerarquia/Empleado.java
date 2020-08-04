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
public class Empleado {
    protected double salario;
    protected String nombresYapellidos;
    protected double cedula;

    public Empleado(String nombresYapellidos, double cedula) {
        //this.salario = salario;
        this.nombresYapellidos = nombresYapellidos;
        this.cedula = cedula;
    }
    
    public Empleado(double salario){
        this.salario = salario;
    }

    
    public void setNombresYapellidos(String nombresYapellidos) {
        this.nombresYapellidos = nombresYapellidos;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCedula(double cedula) {
        this.cedula = cedula;
    }

    public double getSalario() {
        return salario;
    }

    public String getNombresYapellidos() {
        return nombresYapellidos;
    }

    public double getCedula() {
        return cedula;
    }

    
    
    
}