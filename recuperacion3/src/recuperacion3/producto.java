/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion3;

/**
 *
 * @author Juan C. Jiménez
 */
public class producto {
    private int codigo; //auto_increment
    private String nombre;
    private float precio;
    private static int numProducto=0;

    public producto(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.numProducto++;
        this.codigo = this.numProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
    public static void metodoX(){
        System.out.println("Hola");
    }
    
}
