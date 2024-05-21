/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3t;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class Examen3T {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            juegoPreguntas j1 = new juegoPreguntas("juego2.txt");
            j1.jugar();
            System.out.println("PUNTUACIÓN: " + j1.verPuntuacion());
            
        }catch(FileNotFoundException e1){
            System.out.println("No se encuetra el test");
        }catch(IOException e2){
            System.out.println("ERROR de acceso al fichero del test");
        }
        
    }
}
