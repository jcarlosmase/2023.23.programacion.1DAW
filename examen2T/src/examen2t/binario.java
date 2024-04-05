/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

/**
 *
 * @author Juan C. Jiménez
 */
public class binario extends vocal{
    private String cod;
    
    public binario(String v) throws letraNoSoportada{
        super('a');
        switch(v){
            case "000" -> super.setValor('a');
            case "001" -> super.setValor('e');
            case "010" -> super.setValor('i');
            case "011" -> super.setValor('o');
            case "100" -> super.setValor('u');
            default -> throw new letraNoSoportada();
        }
        this.cod = v;
    }
    
    public String getCodigo(){
        return this.cod;
    }
}
