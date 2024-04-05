/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosillasvariasdearraylist;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class CosillasVariasDeArraylist {

    /**
     * @param args the command line arguments
     */
    public static boolean esProhibido(ArrayList<String> palabras){
        if(palabras.get(0).contains("HOla"))
        return true;
        return false;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> cosas = new ArrayList<String>();
        ArrayList<String> cosasDistintas = new ArrayList<String>();
        cosas.add("mariposas");
        cosas.add("mariposas");
        cosas.add("mariposas");
        cosas.add("pajaros");
        cosas.add("pajaros");
        cosas.add("peces");
        cosas.add("leones");
        cosas.add("leones");
        cosas.add("leones");
        cosas.add("leones");
        cosas.add("perros");
        cosas.add("perros");
        cosas.add("perros");
        cosas.add("perros");
        cosas.add("perros");
       
        for (String cosa : cosas) {
            if(!cosasDistintas.contains(cosa))
               cosasDistintas.add(cosa);
        }
        System.out.println(cosas);
        System.out.println(cosasDistintas);
        
    }
    
}
