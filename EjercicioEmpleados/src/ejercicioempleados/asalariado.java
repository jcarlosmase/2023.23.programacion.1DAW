/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleados;

/**
 *
 * @author Juan C. Jiménez
 */
public class asalariado extends empleado {
    private double sueldo;

    public asalariado(double sueldo, String DNI, String nombre, String apellidos) {
        super(DNI, nombre, apellidos);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + " asalariado{" + "sueldo=" + sueldo + '}';
    }
    
    @Override
    public double salario() {
        return this.sueldo;
    }
    
}
