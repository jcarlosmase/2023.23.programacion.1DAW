/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros.cuentapalabra;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */

public class FicherosCuentaPalabra {

    public static int cuentaPalabra(String cadena, String palabra) {
        String temp = cadena.toLowerCase().replaceAll("@", "-");
        String temp2 = temp.replaceAll(palabra.toLowerCase(), "@");
        String [] trozos = temp2.split("@");
        return trozos.length - 1;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String prueba = "HolaClase.Holaotravez";
        System.out.println(prueba.replaceAll("Hola", "Adios"));
        /*int contador = 0;
        String palabra;
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.println("¿Qué palabra quieres buscar?");
            palabra = sc.nextLine();
            BufferedReader br = new BufferedReader(new FileReader("PFRO.log"));
            String linea = "";
            while (linea != null) {
                contador += cuentaPalabra(linea,palabra);
                linea = br.readLine();
                System.out.println(linea);
            }
            br.close();
            System.out.println(palabra + " está " + contador + " veces");
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero malaga.txt");
        } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero malaga.txt");
        }*/
    }
    
}
