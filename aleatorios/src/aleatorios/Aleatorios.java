/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aleatorios;

/**
 *
 * @author Juan C. Jiménez
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5;
        int m=15;
        double a = Math.random();
        
        System.out.println(a);
        System.out.println((int)(a*m));
        System.out.println((int)(a*(m+1)));
        System.out.println(((int)(a*(m+1))+n));
        System.out.println(((int)(a*(m-n+1))+n));
    }
    
}
