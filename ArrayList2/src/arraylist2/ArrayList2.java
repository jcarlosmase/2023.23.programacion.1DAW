/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist2;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan C. Jiménez
 */
public class ArrayList2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        numeros.add(45);
        numeros.add(-23);
        numeros.add(0);
        numeros.add(80);
        numeros.add(14);
        
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

        ArrayList<String> palabras = new ArrayList<String>();
        
        palabras.add("Mariposa");
        palabras.add("Libertad");
        palabras.add("andalucia");
        palabras.add("zapato");
        
        System.out.println(palabras);
        Collections.sort(palabras);
        System.out.println(palabras);
    }
    
}
