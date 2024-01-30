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
        try {
            BufferedReader br = new BufferedReader(new FileReader("cosa.txt"));
            String linea = "";
            while (linea != null) {
                System.out.println(linea);
                linea = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException fnfe) { // qué hacer si no se encuentra el fichero
            System.out.println("No se encuentra el fichero cosa.txt");
        } catch (IOException ioe) { // qué hacer si hay un error en la lectura del fichero
            System.out.println("No se puede leer el fichero cosa.txt");
        }
    }
}
