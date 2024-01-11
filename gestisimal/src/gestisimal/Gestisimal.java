/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestisimal;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Gestisimal {

    /**
     * @param args the command line arguments
     */
    public static void menu(){
        System.out.println("+-----BIENBENIDOS A GESTIMAL-----+");
        System.out.println("|(Gestión integral de almacenes) |");
        System.out.println("+--------------------------------+");
        System.out.println("| 1. Listado de artículos        |");
        System.out.println("| 2. Alta de artículos           |");
        System.out.println("| 3. Baja de artículos           |");
        System.out.println("| 4. Modificación de artículos   |");
        System.out.println("| 5. Entrada de mercancía        |");
        System.out.println("| 6. Salida de mercancía         |");
        System.out.println("| 7. Salir de la aplicación      |");
        System.out.println("+--------------------------------+");
        System.out.println("| Elija una opción del menú      |");
        System.out.println("+--------------------------------+");        
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        Scanner sc = new Scanner(System.in);
        
        do{
           menu();
           opc = sc.nextInt();
           switch(opc){
               case 1:  //Listado de artículos
                   break;
               case 2:  //Alta de artículos
                   break;
               case 3:  //Baja de artículos
                   break;
               case 4:  //Modificación de artículos
                   break;
               case 5:  //Entrada de mercancía
                   break;
               case 6:  //Salida de mercancía
                   break;
           }
        }while(opc!=7);
        System.out.println("ADIOS");
    }
}
