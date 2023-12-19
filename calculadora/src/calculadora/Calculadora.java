/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int opcion;
        int n1,n2;
        int resultado;
        
        do{
            System.out.println("CALCULADORA");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Salir");
            System.out.println("¿Qué quieres hacer?");
            opcion = sc.nextInt();
            switch(opcion){
                case 1: //Sumar
                    System.out.println("Dime un numero");
                    n1=sc.nextInt();
                    System.out.println("Dime otro numero");
                    n2=sc.nextInt();
                    resultado = suma(n1,n2); // <-- Llamada a la función suma
                    System.out.println(n1+"+"+n2+"="+resultado);
                    break;
                case 2: //Restar
                    System.out.println("Dime un numero");
                    n1=sc.nextInt();
                    System.out.println("Dime otro numero");
                    n2=sc.nextInt();
                    resultado = resta(n1,n2); // <-- Llamada a la función resta
                    System.out.println(n1+"-"+n2+"="+resultado);
                    break;
                case 3: //Salir
                    break;
                default:
                    System.out.println("Por favor, elige una opción correcta (1-3)");
            }
        }while(opcion!=3);
    }///Fin de la función main
    
    //////Funciones definidas por el usuario
    //Funcion SUMA
    public static int suma(int num1, int num2){
        int resultado;
        
        resultado = num1+num2;
        return resultado;
    }
    
    //Función resta
    public static int resta(int num1, int num2){
       
        return (num1-num2);
    }
    
}
