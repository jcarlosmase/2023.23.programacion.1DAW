/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion6;

/**
 *
 * @author Juan C. Jiménez
 */
public class producto implements Comparable<producto>{
    private String nombre;
    private String familia;
    private float precio;
    private int stock;

    public producto(String nombre, String familia, float precio, int stock) {
        this.nombre = nombre;
        this.familia = familia;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", familia=" + familia + ", precio=" + precio + ", stock=" + stock + '}';
    }

    @Override
    public int compareTo(producto o) {
        if(this.familia.equals(o.getFamilia())){
            if(this.nombre.equals(o.getNombre())){
                if(this.precio == o.getPrecio()){
                    if(this.stock == o.getStock()){
                        return 0;
                    }else{
                        if(this.stock < o.getStock())
                            return -1;
                        else
                            return 1;
                    }
                }else{
                    if(this.precio > o.getPrecio())
                        return -1;
                    else
                        return 1;
                }
            }else{
                return this.nombre.compareTo(o.getNombre());
            }
        }else{
            return this.familia.compareTo(o.getFamilia());
        }
    }
    
}
