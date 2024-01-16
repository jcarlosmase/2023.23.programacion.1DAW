/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author Juan C. Jiménez
 */
public class policia extends persona{
    
    private String cargo;
    private int numPlaca;
    
    public policia(String d, String n, String a, float p, int e, String car, int nP){
        super(d,n,a,p,e);
        this.cargo = car;
        this.numPlaca = nP;
        
    }

    public String getCargo() {
        return cargo;
    }

    public int getNumPlaca() {
        return numPlaca;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setNumPlaca(int numPlaca) {
        this.numPlaca = numPlaca;
    }
    
    @Override
    public String toString(){
        String aux = super.toString();
        
        aux += "Datos del agente\n";
        aux += "-------------------\n";
        aux += "Cargo: " + this.cargo + "\n";
        aux += "Nº de placa: " + this.numPlaca + "\n";
        return aux;
    }
    
}
