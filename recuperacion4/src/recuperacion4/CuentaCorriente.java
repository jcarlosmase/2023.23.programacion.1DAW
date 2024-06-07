/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion4;

/**
 *
 * @author Juan C. Jiménez
 */
public class CuentaCorriente {
    private String nCuenta;
    private float saldo;
    
    public CuentaCorriente(){
        this.nCuenta = "";
        for (int i = 0; i < 10; i++) {
            this.nCuenta += Numeros.Aleatorio(0, 9);
        }
        this.saldo = 0f;
    }

    public CuentaCorriente(float saldoInicial){
        this.nCuenta = "";
        for (int i = 0; i < 10; i++) {
            this.nCuenta += Numeros.Aleatorio(0, 9);
        }
        this.saldo = saldoInicial;
    }

    public void ingreso(float cantidad){
        this.saldo += cantidad;
    }

    public void cargo(float cantidad){
        this.saldo -= cantidad;
    }
    
    public void transferencia(CuentaCorriente destino, float cantidad){
        this.cargo(cantidad);
        destino.ingreso(cantidad);
    }
    
    @Override
    public String toString() {
        return "Numero de cuenta: " + nCuenta + " Saldo: " + saldo + " €";
    }
}
