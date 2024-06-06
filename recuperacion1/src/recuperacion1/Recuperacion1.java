/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion1;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion1 {

    /**
     * @param args the command line arguments
     */
    
    /*Crea una cabecera de una función/procedimiento que reciba un array de 10 
    números enteros y nos diga o devuelva el mayor de ellos*/
    public static int numeroMayor(int [] array10Numeros){
        return 0;
    }
    
    /*Crea una cabecera de una función/procedimiento que indique si está o no está una
    palabra dentro de un texto recibido como parámetro*/
    public static boolean existePalabra(String palabra, String texto){
        return false;
    }
    
    /*Crea una cabecera de una función/procedimiento que escriba en pantalla un menú con 5 opciones*/
    public static void menuOpciones(String [] menu){
        System.out.println("**** MENU *****");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i+1) + ". " + menu[i]);
        }
        System.out.println("Elija una opción: ");
    }
    
    public static void sumaYresta(int a, int b, int [] resultado){
        resultado[0] = a+b;
        resultado[1] = a-b;
    }
    
    public static void sumaYresta2(int a, int b, int suma, int resta){
        suma = a+b;
        resta = a-b;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 15;
        int num2 = 10;
        int [] resul = new int[2];
        int s=0,r=0;
        
        sumaYresta(num1,num2,resul); ///<-- Llamada a la función
        System.out.println("La suma es " + resul[0]);
        System.out.println("La resta es " + resul[1]);
        
        sumaYresta2(num1,num2,s,r); ///<-- Llamada a la función
        System.out.println("La suma es " + s);
        System.out.println("La resta es " + r);
        
        String [] opciones = {"Opción 1", "Opción 2", "Opción 3", "Salir"};
        menuOpciones(opciones);
        
    }
    
}
