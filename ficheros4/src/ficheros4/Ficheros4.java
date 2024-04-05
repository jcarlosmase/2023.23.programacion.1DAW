/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ficheros4;

import java.io.File;

/**
 *
 * @author Juan C. Jiménez
 */
public class Ficheros4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("parametros del main");
        for(String param : args){
            System.out.println(param);
        }
        
/*        int [] cosas = {1,2,3,4,5,6,7};
        for (int i : cosas) {
            System.out.println(i);
        }*/
        /*File f = new File(".");
        String [] ficheros = f.list();
        
        for (String fich : ficheros) {
            System.out.println(fich);
        }*/
    }
    
}
