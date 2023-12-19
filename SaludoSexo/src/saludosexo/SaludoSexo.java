/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludosexo;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class SaludoSexo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String nombre, sexo;
        
        System.out.println("Hola, como te llamas?");
        nombre = sc.nextLine();
        System.out.println("hombre o mujer?");
        sexo = sc.nextLine();
        if("hombre".equals(sexo)){
            System.out.println("Hola Sr. " + nombre);
        }else{
            System.out.println("Hola Sra. " + nombre);
        }
    }
    
}
