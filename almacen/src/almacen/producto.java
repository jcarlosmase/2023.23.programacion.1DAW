/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Juan C. Jiménez
 */
public class producto {
    private String codigo;
    private String nombre;
    private int stock;
    private float Pcompra;
    private float Pventa;
    private static int numProductos=0;

    public producto(String nombre, int stock, float Pcompra, float Pventa) {
        this.nombre = nombre;
        this.stock = stock;
        this.Pcompra = Pcompra;
        this.Pventa = Pventa;
        this.numProductos++;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public float getPcompra() {
        return Pcompra;
    }

    public float getPventa() {
        return Pventa;
    }

    public static int getNumProductos() {
        return numProductos;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setPcompra(float Pcompra) {
        this.Pcompra = Pcompra;
    }

    public void setPventa(float Pventa) {
        this.Pventa = Pventa;
    }

    public String getLinea(){
        return this.codigo + ";" + this.nombre + ";" + this.stock + this.Pcompra + ";" + this.Pventa; 
    }
    
    @Override
    public String toString() {
        return "producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", stock=" + stock + ", Pcompra=" + Pcompra + ", Pventa=" + Pventa + '}';
    }

}
