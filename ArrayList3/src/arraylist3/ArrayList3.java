/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist3;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan C. Jiménez
 */
public class ArrayList3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<persona> gente = new ArrayList<persona>();
        
        gente.add(new persona("Lola", "Pérez", "Jiménez", 18));
        gente.add(new persona("Pepe", "López", "Rodríguez", 21));
        gente.add(new persona("María", "Pérez", "Jiménez", 14));
        gente.add(new persona("Ana", "garcía", "López", 5));
        
        /*System.out.println(gente);
        Collections.sort(gente);
        System.out.println(gente);*/
        
        System.out.println(gente.get(0).compareTo(gente.get(1)));
    }
    
}
