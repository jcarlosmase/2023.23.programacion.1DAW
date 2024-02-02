/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package telefonos;

import java.io.FileNotFoundException;
import java.io.IOException;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

/**
 *
 * @author Juan C. Jiménez
 */
public class Telefonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            compañia vodafone = new compañia("clientes1.txt");
            System.out.println(vodafone);
        }catch(FileNotFoundException fnf){
            System.out.println("El archivo de clientes no existe");
        }catch(IOException ioE){
            System.out.println("No se puede acceder al archivo de clientes. Compruebe el acceso al fichero");
        }
        
    }
    
}
