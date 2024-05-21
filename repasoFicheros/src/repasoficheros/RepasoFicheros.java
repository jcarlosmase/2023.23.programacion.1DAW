/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repasoficheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class RepasoFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        //Leer de un fichero
        //1. Declaro un manejador de fichero
        try{
            BufferedReader manejador = new BufferedReader(new FileReader("datos.txt"));
            String linea;
            String dato1;
            int dato2;
            boolean dato3;
            float dato4;
            String [] datos;
            
            /*do{
                linea = manejador.readLine();
                if(linea != null){//No estoy en el final del fichero
                    datos = linea.split(";");
                    System.out.println("Linea: " + linea);
                    dato1 = datos[0];
                    System.out.println("dato1: " + dato1);
                    dato2 = Integer.parseInt(datos[1]);
                    System.out.println("dato2: " + dato2);
                    dato3 = (datos[2]=="Verdadero"?true:false);
                    System.out.println("dato3: " + dato3);
                    dato4 = Float.parseFloat(datos[3]);
                    System.out.println("dato4: " + dato4);
                }
            }while(linea!=null);*/
            manejador.close();
            //Escritura de un fichero
            BufferedWriter manejador2 = new BufferedWriter(new FileWriter("datos.txt"));
            
            manejador2.write("Coooooooosas1111\n");
            manejador2.write("Coooooooosas2222");
            
            manejador2.close();
            
        }catch(FileNotFoundException e1){
            System.out.println(e1.getMessage());
        }catch(IOException e2){
            System.out.println(e2.getMessage());
        }
    }
    
}
