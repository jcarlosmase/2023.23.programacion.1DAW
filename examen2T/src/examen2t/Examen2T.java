/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2t;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class Examen2T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            mensajeSecreto msg1 = new mensajeSecreto("mensaje.txt");
            System.out.println(msg1.decodificar());
            System.out.println("Mensaje codificado\n");
            System.out.println(msg1.codificar());
        } catch (letraNoSoportada lns) {
            System.out.println(lns.getMessage());
            //System.out.println("ERROR: El mensaje no se puede decodificar");
        } catch (FileNotFoundException fnf) {
            System.out.println("ERROR: No se encuentra el fichero");
        } catch (IOException IOe) {
            System.out.println("ERROR: No hay acceso al fichero");
        }
    }

}
