/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosa;

import java.text.DecimalFormat;

/**
 *
 * @author Juan C. Jiménez
 */
public class Cosa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float num1 = 1.234f;
        float num2 = 10.23f;
        float resultado;
        
        resultado=num1*num2;
        DecimalFormat formato1 = new DecimalFormat("#.00");
        System.out.println(formato1.format(resultado));
    }
    
}
