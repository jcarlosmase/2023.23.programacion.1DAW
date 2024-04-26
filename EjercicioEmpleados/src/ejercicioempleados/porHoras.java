/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleados;

/**
 *
 * @author Juan C. Jiménez
 */
public class porHoras extends empleado{
    
    private int numHoras;
    private double precioHora;
    private double precioHoraExtra;

    public porHoras(double precioHora, double precioHoraExtra, String DNI, String nombre, String apellidos) {
        super(DNI, nombre, apellidos);
        this.numHoras = 0;
        this.precioHora = precioHora;
        this.precioHoraExtra = precioHoraExtra;
    }

    public int getNumHoras() {
        return numHoras;
    }

    public void setNumHoras(int numHoras) {
        this.numHoras = numHoras;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }

    @Override
    public String toString() {
        return super.toString() + " porHoras{" + "numHoras=" + numHoras + ", precioHora=" + precioHora + ", precioHoraExtra=" + precioHoraExtra + '}';
    }
       
    @Override
    public double salario() {
        if(this.numHoras <= 40)
            return this.numHoras * this.precioHora;
        return (40*this.precioHora) + ((this.numHoras - 40) * this.precioHoraExtra);
    }
    
}
