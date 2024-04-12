/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Juan C. Jiménez
 */
public abstract class figuraGeometrica {
    
    private String nombre;
    
    public figuraGeometrica(String n){
        this.nombre = n;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public String toString(){
        return "[" + this.nombre + "]";
    }
    
    public abstract double area();
    
    public abstract double perimetro();
    
    //public abstract double getRadio();
}
