/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleados;

/**
 *
 * @author Juan C. Jiménez
 */
public class porComision extends empleado{
    
    private double ventas;
    private double comision;

    public porComision(double comision, String DNI, String nombre, String apellidos) {
        super(DNI, nombre, apellidos);
        this.comision = comision;
        this.ventas = 0;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = ventas;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    @Override
    public String toString() {
        return super.toString() + " porComision{" + "ventas=" + ventas + ", comision=" + comision + '}';
    }
    
    @Override
    public double salario() {
        return this.ventas * this.comision / 100;
    }
    
}
