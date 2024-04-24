/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropaabstracta;

import java.text.DecimalFormat;

/**
 *
 * @author Juan C. Jiménez
 */
public class clienteB extends cliente{
    private double compras;
    private static final double dto = 0.05f;

    public clienteB(double compras, String cod, String nombre, String apellidos) {
        super(cod, nombre, apellidos);
        this.compras = compras;
    }

    public double getCompras() {
        return compras;
    }

    public void setCompras(double compras) {
        this.compras = compras;
    }
    
    public String toString(){
        return super.toString() + " TOTAL COMPRAS: " + this.compras;
    }
    
    @Override
    public String aplicarDescuento() {
        DecimalFormat df = new DecimalFormat("#.00");
        double resul;
        
        if(this.compras >= 10000){
            return df.format((1 - this.dto) * this.compras);
        }else{
            return df.format(this.compras);
        }
    }
}
