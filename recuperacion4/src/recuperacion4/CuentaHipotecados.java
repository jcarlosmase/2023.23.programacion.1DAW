/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion4;

/**
 *
 * @author Juan C. Jiménez
 */
public class CuentaHipotecados extends CuentaCorriente{
    private float comision;
    
    public CuentaHipotecados(float comision){
        super();
        this.comision = comision;
    }
    
    public CuentaHipotecados(float saldoInicial, float comision){
        super(saldoInicial);
        this.comision = comision;
    }
    
    @Override
    public void transferencia(CuentaCorriente destino, float cantidad){
        super.transferencia(destino, cantidad);
        super.cargo(this.comision);
    }
}
