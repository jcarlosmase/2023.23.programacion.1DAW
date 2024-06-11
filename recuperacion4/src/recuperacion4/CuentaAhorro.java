/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion4;

/**
 *
 * @author Juan C. Jiménez
 */
public class CuentaAhorro extends CuentaCorriente{
    private float tipoInteres;
    
    public CuentaAhorro(float tipoInteres){
        super();
        this.tipoInteres = tipoInteres;
    }
    
    public CuentaAhorro(float saldoInicial, float tipoInteres){
        super(saldoInicial);
        this.tipoInteres = tipoInteres;
    }
    
    @Override
    public void ingreso(float Cantidad){
        int cien = (int) (Cantidad/100);
        
        super.ingreso(Cantidad);
        super.ingreso(cien*this.tipoInteres/100);
    }
}
