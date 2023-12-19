/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentacorriente;

/**
 *
 * @author Juan C. Jiménez
 */
public class cuenta {
    //Atributos de la clase
    private String cliente;
    private String numCuenta;
    private double tipoInteres;
    private double saldo;
    private final float PI = 3.14f;
    
    //constructores
    public cuenta(){
        this.cliente = "";
        this.numCuenta = "";
        this.tipoInteres=0;
        this.saldo = 0;
    }
    public cuenta(String cl, String nc, double tI, double s){
        this.cliente = cl;
        this.numCuenta = nc;
        this.tipoInteres = tI;
        this.saldo = s;
    }
    
    public cuenta(cuenta c){
        this.cliente = c.getCliente();
        this.numCuenta = c.getnumCuenta();
        this.tipoInteres = c.getTipoInteres();
        this.saldo = c.getSaldo();
    }
    
    //métodos getters y setters
    //getters
    public String getCliente(){
        return this.cliente;
    }
    public String getnumCuenta(){
        return this.numCuenta;
    }
    public double getTipoInteres(){
        return this.tipoInteres;
    }
    public double getSaldo(){
        return this.saldo;
    }
    //setters
    public void setCliente(String cl){
        this.cliente = cl;
    }
    public void setSaldo(double s){
        if(s>=0)
            this.saldo = s;
    }
    //método reintegro: disminuye el saldo según la cantidad que se pasa. La cantidad no puede ser negativa,
    //Tiene que haber saldo suficiente. Devuelve true si se puede hacer, false en otro caso.
    public boolean reintegro(double cantidad){
        if(cantidad < 0){
            return false;
        }else if(cantidad > this.saldo){
            return false;
        }else{
            this.saldo -= cantidad; // this.saldo = this.saldo - cantidad;
            return true;
        }
    }
    
    public boolean ingreso(double cant){
        if(cant < 0)
            return false;
        this.saldo += cant;
        return true;
    }
    
    public boolean transferencia(double cant,cuenta destino){
        if(this.reintegro(cant)){
            destino.ingreso(cant);
            return true;
        }
        return false;
    }
}
