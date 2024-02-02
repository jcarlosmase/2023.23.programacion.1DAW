/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonos;

/**
 *
 * @author Juan C. Jiménez
 */
public class terminal {
    private String numero;
    private int duracion;
    
    public terminal(String n){
        this.numero = n;
        this.duracion = 0;
    }
    
    public void llama(terminal t1, int d){
        this.duracion += d;
        t1.setDuracion(d + t1.getDuracion());
    }

    public String getNumero() {
        return numero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public String toString(){
        return  "Nº " + this.numero + " - " + this.duracion + "s de conversación";
    }
}
