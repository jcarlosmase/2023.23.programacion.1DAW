/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class Ficheros1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena = "Hola Clase, ¿cómo estais? espero que bien";
        String [] cadena2;
        
        /*for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i));
        }*/
        
        cadena2 = cadena.split(" ");
        for (int i = 0; i < cadena2.length; i++) {
            System.out.println(cadena2[i]);
        }
        /*System.out.println(cadena.substring(0,5).toUpperCase() + cadena.substring(5).toLowerCase());
        cadena2 = cadena.replace('a', '@');
        System.out.println(cadena.replace("Clase", "Mundo mundial"));
        System.out.println(cadena2);*/
        //System.out.println(cadena);
    }
}
