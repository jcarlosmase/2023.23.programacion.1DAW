/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebecilla;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Pruebecilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int num;
        String resul;
        
        System.out.println("Dimen un número");
        num = sc.nextInt();
        resul = num>=0?"Es positivo":"Es negativo";
        System.out.println(resul);
    }
    
}
