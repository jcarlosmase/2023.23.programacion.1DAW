/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

/**
 *
 * @author Juan C. Jiménez
 */
public abstract class vocal implements codificacion{
    private char valor;
    
    public vocal(char v) throws letraNoSoportada{
        if(v!='a' && v!='e' && v!='i' && v!='o' && v!='u'){
            throw new letraNoSoportada();
        }
        this.valor = v;
    }
    
    @Override
    public char getValor() {
        return this.valor;
    }

    @Override
    public void setValor(char v) {
        this.valor = v;
    }
    
    public abstract String getCodigo();
      
}
