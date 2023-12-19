/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conversormonedas;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class ConversorMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        DecimalFormat euros = new DecimalFormat("#.00");
        float cantidad;
        int opcion;
        
        do{
            System.out.println("¿Qué quieres hacer? Selecciona una opción");
            System.out.println("1. Pasar de euros a pesetas.");
            System.out.println("2. Pasar de pesetas a euros");
            System.out.println("3. Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: //De euros a pesetas
                    System.out.println("Dime una cantidad en euros: ");
                    cantidad = sc.nextFloat();
                    System.out.println(euros.format(cantidad) + "€ son "+Math.round(cantidad*166.386) + " pts");
                    break;
                case 2: //De pesetas a euros
                    System.out.println("Dime una cantidad en pesetas: ");
                    cantidad = sc.nextFloat();
                    System.out.println(Math.round(cantidad) + "pts son "+euros.format(cantidad/166.386) + " €");
                    break;
            }
        }while(opcion != 3);
        System.out.println("ADIOS");
    }
    
}
