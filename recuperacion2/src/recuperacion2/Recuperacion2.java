/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion2;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*alumno a1 = new alumno("Pepe","Perez");
        alumno a2 = new alumno("Ana","Lopez");
        alumno a3 = new alumno("Luis","Jiménez");
        
        System.out.println(a1.getBeca());
        System.out.println(a2.getBeca());
        System.out.println(a3.getBeca());
        
        a1.setBeca(1000);
        
        System.out.println(a1.getBeca());
        System.out.println(a2.getBeca());
        System.out.println(a3.getBeca());
        
        alumno a4 = new alumno("Lorenzo","Rodríguez");
        System.out.println(a4.getBeca());*/
        
        /*producto p1 = new producto("Chicles",0.05f);
        producto p2 = new producto("Piruletas",0.10f);
        producto p3 = new producto("Gusanitos",1.50f);
        producto p4 = new producto("Pipas",0.50f);*/
        
        //producto.getNombre(); // No se puede porque getNombre NO es estático
        //producto.metodoX();   //Si se puede porque metodoX SI es estático
        
        /*System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);*/
        
        Scanner sc = new Scanner(System.in);
        int edad;
        String nombre, apellidos;
        
        System.out.println("Vamos a añadir una persona al club de caza");
        System.out.println("Dime su edad");
        edad = sc.nextInt();
        persona p;
        if(persona.esMayorEdad(edad)){
            System.out.println("Dime su nombre");
            nombre = sc.nextLine();
            nombre = sc.nextLine();
            System.out.println("Dime su apellido");
            apellidos = sc.nextLine();
            
            persona persona1 = new persona(nombre,apellidos,edad);
            System.out.println(persona1);
        }else{
            System.out.println("No se admiten a menores en el club");
        }
    }
    
}
