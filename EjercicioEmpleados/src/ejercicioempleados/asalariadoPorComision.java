/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleados;

/**
 *
 * @author Juan C. Jiménez
 */
public class asalariadoPorComision extends porComision{
    private double sueldo;
    private double incentivo;

    public asalariadoPorComision(double salario, double comision, String DNI, String nombre, String apellidos) {
        super(comision, DNI, nombre, apellidos);
        this.sueldo = salario;
        this.incentivo = 0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " asalariadoPorComision{" + "sueldo=" + sueldo + '}';
    }
    
    public void recompensa(double incentivo){
        this.incentivo = incentivo;
    }
    
    @Override
    public double salario(){
        double base = (incentivo!=0?this.sueldo * (1+(this.incentivo/100)):this.sueldo);
        
        return super.salario() + base;
    }
    
}
