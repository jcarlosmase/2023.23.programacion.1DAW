/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cochera;

import java.util.HashMap;

/**
 *
 * @author Juan C. Jiménez
 */
public class Cochera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, coche> cochera1 = new HashMap<String, coche>();
        
        cochera1.put("1111AAA", new coche("Opel","Corsa",5,1000f));
        //1. Meter 10-15 coches en la cochera
        //2. Mostrar en pantalla todos los datos de los coches de la marca "Seat"
        //3. Mostrar la matrícula, marca y modelo de los coches cuya matrícula empiece por 'J'
        //4. Hacer un listado completo de toda la cochera ordenando los coches por peso (ASC)
        
    }
    
}
