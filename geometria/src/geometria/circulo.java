/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria;

/**
 *
 * @author Juan C. Jiménez
 */
public class circulo extends figuraGeometrica {
    
    private double radio;
    private static final float PI = 3.14f;
    
    public circulo(double radio){
        super("circulo");
        this.radio = radio;
    }
    
    @Override
    public double area() {
        return PI * Math.pow(radio,2);
    }

    @Override
    public double perimetro() {
        return 2 * PI * this.radio;
    }
    
    @Override
    public String toString(){
        return super.toString() + " Radio = " + this.radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
