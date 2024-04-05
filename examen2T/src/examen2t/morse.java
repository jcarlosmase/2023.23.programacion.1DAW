/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

/**
 *
 * @author Juan C. Jiménez
 */
public class morse extends vocal {

    private String cod;

    public morse(String v) throws letraNoSoportada {
        super('a');
        switch (v) {
            case "..." ->
                super.setValor('a');
            case "..-" ->
                super.setValor('e');
            case ".-." ->
                super.setValor('i');
            case ".--" ->
                super.setValor('o');
            case "-.." ->
                super.setValor('u');
            default ->
                throw new letraNoSoportada();
        }
        this.cod = v;
    }

    public String getCodigo() {
        return this.cod;
    }
}
