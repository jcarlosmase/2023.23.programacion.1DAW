/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumador;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Sumador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ZONA DE DECLARACIONES DE VARIABLES
        Scanner s = new Scanner(System.in);
        int num1, num2;
        
        //ZONA DE INICIO DEL PROGRAMA main
        System.out.println("Dime un número: ");
        num1 = s.nextInt();
        System.out.println("Dime otro número: ");
        num2 = s.nextInt();
        System.out.println(num1 + "+" + num2 + "=" + (int)(num1+num2));
    }
    
}
