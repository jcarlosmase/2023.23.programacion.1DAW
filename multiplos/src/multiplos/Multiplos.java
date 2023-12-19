/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un número: ");
        num=sc.nextInt();
        
        /*Versión 1.0*/
        System.out.println("Versión 1.0");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
        }
                
        /*Version 2.0*/
        System.out.print("\n\nVersión 2.0");
        System.out.print("\n1 ");
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.print(num + " ");
    }
    
}
