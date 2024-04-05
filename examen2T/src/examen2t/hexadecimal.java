/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

/**
 *
 * @author Juan C. Jiménez
 */
public class hexadecimal extends vocal {

    private String cod;

    public hexadecimal(String v) throws letraNoSoportada {
        super('a');
        switch (v) {
            case "aaa" ->
                super.setValor('a');
            case "eee" ->
                super.setValor('e');
            case "iii" ->
                super.setValor('i');
            case "ooo" ->
                super.setValor('o');
            case "uuu" ->
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
