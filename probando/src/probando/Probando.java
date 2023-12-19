/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probando;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Probando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        // TODO code application logic here
        
        System.out.println("Hola, como te llamas?");
        nombre = sc.nextLine();
        System.out.println("Hola " + nombre + ", como estas?");
    }
    
}
