/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instrucciones;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Instrucciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int valor;
        Scanner sc1 = new Scanner(System.in);
        // TODO code application logic here
        //Alternativas
        //SIMPLE
        /*
        if(expresión lógica){
            Bloque de instrucciones (cuerpo)
        }
        EJEMPLO
        */
        int a=0;
        int b=-9;
        if(a>=0){
            System.out.println("La variable a es positiva");
        }
        if(b>=0){
            System.out.println("La variable b es positiva");
        }
        /*Alernativa doble
        if(condicion){
            Bloque instrucciones si verdadero
        }else{
            Bloque instrucciones si falso
        }
        EJEMPLO
        */
        if(a>=0){
            System.out.println("a es positivo");
        }else{
            System.out.println("a es negativo");
        }
        if(b>=0){
            System.out.println("b es positivo");
        }else{
            System.out.println("b es negativo");
        }
        
        /* Alternativa múltiple*/
        System.out.println("Dame un número");
        valor = sc1.nextInt();
        switch(valor){
            case 1:
                System.out.println("El valor es uno");
                /*
                Aquí puedo poner un bloque de instrucciones
                cualquiera
                */
                break;
            case 2:
                System.out.println("El valor es dos");
                break;
            default:
                System.out.println("Ninguno de los anteriores");
                break;
        }
    }
    
}
