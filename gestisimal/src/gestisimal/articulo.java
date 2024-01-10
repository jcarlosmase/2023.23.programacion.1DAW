/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestisimal;

/**
 *
 * @author Juan C. Jiménez Masegosa
 */
public class articulo {
    private String codigo;
    private String descripcion;
    private float precioCompra;
    private float precioVenta;
    private int stock;
    
    //constructores
    public articulo(String c, String d, float pc, float pv, int s){
        this.codigo = c;
        this.descripcion = d;
        this.precioCompra = pc;
        this.precioVenta = pv;
        this.stock = s;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public float getPrecioCompra() {
        return precioCompra;
    }

    public float getPrecioVenta() {
        return precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioCompra(float precioCompra) {
        this.precioCompra = precioCompra;
    }

    public void setPrecioVenta(float precioVenta) {
        this.precioVenta = precioVenta;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public String toString(){
        String art = "";
        art = this.codigo + "\t" +
              this.descripcion + "\t\t" +
              this.precioCompra + "€\t" +
              this.precioVenta + "€\t" +
              this.stock;
        return art;
    }
}
