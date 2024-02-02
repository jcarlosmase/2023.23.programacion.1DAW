/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonos;

import java.text.DecimalFormat;

/**
 *
 * @author Juan C. Jiménez
 */
public class movil extends terminal {
    private double dinero;
    private String tarifa;
    
    public movil(String n, String t){
        super(n);
        this.dinero = 0f;
        this.tarifa = t;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    public void llama(movil m, int d){
        super.llama(m,d);
        switch(this.tarifa){
            case "rata":
                this.dinero += ((d/60f)*0.06f);
                break;
            case "mono":
                this.dinero += ((d/60f)*0.12f);
                break;
            case "bisonte":
                this.dinero += ((d/60f)*0.30f);
                break;
        }
    }
    
    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return super.toString() + " - tarificados " + df.format(this.dinero) + " euros";
    }
}
