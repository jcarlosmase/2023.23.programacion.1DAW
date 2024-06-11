/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
            /*try{
                coche c1 = new coche("Seat","Ibiza","Blanco");
                coche c2 = new coche("Renault","Clio","Rojo");
                
                c2.setColor("Amarillo");

                System.out.println(c1);
                System.out.println(c2);
            }catch(noCochesAmarillos CAE){
                CAE.getMessage();
            }*/
            try{
                BufferedReader br = new BufferedReader(new FileReader("fichero.txt"));
                String texto;
                int contador=0;
                String [] trozos;
                
                do{
                    texto = br.readLine();
                    if(texto != null){
                        trozos = texto.split(" ");
                        contador += trozos.length;
                        System.out.println(texto);
                    }
                }while(texto != null);
                System.out.println("Hay " + contador + " palabras");
                br.close();
            }catch(IOException IOE){
                System.out.println("No se encuentra el fichero");
            }
    }
    
}
