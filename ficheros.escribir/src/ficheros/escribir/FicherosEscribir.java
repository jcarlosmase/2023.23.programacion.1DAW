/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros.escribir;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class FicherosEscribir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String linea = "El maravilloso mundo de la programacion";
        String traspuesta="";
        
        System.out.println(linea);
        for (int i = linea.length() - 1; i >=0 ; i--) {
            traspuesta+=linea.charAt(i);
        }
        System.out.println(traspuesta);
        
        
        /*try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("fruta.txt"));
            bw.write("platanos\n");
            bw.write("manzanas\n");
            bw.write("ciruelas\n");
            bw.close();
        } catch (IOException ioe) {
            System.out.println("No se ha podido escribir en el fichero");
        }*/
    }
    
}
