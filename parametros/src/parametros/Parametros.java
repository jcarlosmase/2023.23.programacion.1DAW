/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parametros;
import pasoParametros.intercambio;

/**
 *
 * @author Juan C. Jiménez
 */
public class Parametros {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num1=-1;
        int num2=1;
        int [] numeros = {-1,1};
        
        System.out.println("numeros -> \t"+num1+" | "+num2);
        System.out.println("array -> \t"+numeros[0]+" | "+numeros[1]);
        intercambio.swap1(num1, num2);
        intercambio.swap2(numeros);
        System.out.println("numeros -> \t"+num1+" | "+num2);
        System.out.println("array -> \t"+numeros[0]+" | "+numeros[1]);
    }
    
}
