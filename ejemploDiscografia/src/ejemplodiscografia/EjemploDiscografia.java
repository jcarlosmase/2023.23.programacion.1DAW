/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplodiscografia;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class EjemploDiscografia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int duracionMax;
        //construyo el array
        Disco [] discografia = new Disco[3];
        Disco d1 = new Disco ("Autor 3", "Titulo 3", "Género 3",150);
        
        discografia[0] = new Disco("Autor 1", "Titulo 1", "Género 1",120);
        discografia[1] = new Disco("Autor 2", "Titulo 2", "Género 2",100);
        discografia[2] = d1;
        
        //Muestro en pantalla la dicografía completa
        for (int i = 0; i < discografia.length; i++) {
            System.out.println(discografia[i]);
        }
        
        //Filtrar el listado de discos por duración
        System.out.println("Dime una duración máxima:");
        duracionMax = sc.nextInt();
        for (int i = 0; i < discografia.length; i++) {
            if(discografia[i].getDuracion() <= duracionMax){
                System.out.println(discografia[i]);
            }
        }
    }
    
}
