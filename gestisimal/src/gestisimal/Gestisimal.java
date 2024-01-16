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
        almacen a = new almacen();
        int opc;
        Scanner sc = new Scanner(System.in);
        String codA, descA;
        float precioCA, precioVA;
        int stockA;
        
        do{
           menu(); //Se imprime el menú en pantalla
           opc = sc.nextInt();
           switch(opc){
               case 1:  //Listado de artículos
                   System.out.println(a);
                   break;
               case 2:  //Alta de artículos
                   sc.nextLine();
                   System.out.println("Introduce un codigo:");
                   codA = sc.nextLine();
                   System.out.println("Introduce una descripción:");
                   descA = sc.nextLine();
                   System.out.println("Introduce un precio de compra:");
                   precioCA = sc.nextFloat();
                   System.out.println("Introduce un precio de venta:");
                   precioVA = sc.nextFloat();
                   System.out.println("Introduce un Stock:");
                   stockA = sc.nextInt();
                   articulo art = new articulo(codA,descA,precioCA,precioVA,stockA);
                   if(a.alta(art)){
                       System.out.println("El artículo se ha guardado correctamente");
                   }else{
                       System.out.println("ERROR: No se ha guardado el artículo");
                   }
                   break;
               case 3:  //Baja de artículos
                   sc.nextLine();
                   System.out.println("Introduce el código de artículo para dar de baja:");
                   codA = sc.nextLine();
                   if(a.baja(codA)){
                       System.out.println("El artículo se ha borrado correctamente");
                   }else{
                       System.out.println("ERROR: No se ha borrado el artículo");
                   }                   
                   break;
               case 4:  //Modificación de artículos
                   sc.nextLine();
                   System.out.println("¿Qué artículo quieres modificar? Introduce el código:");
                   codA = sc.nextLine();
                   break;
               case 5:  //Entrada de mercancía
                   break;
               case 6:  //Salida de mercancía
                   break;
               default:
                   System.out.println("Opción incorrecta. Teclee 1 al 7");
           }
        }while(opc!=7);
        System.out.println("ADIOS");
    }
}
