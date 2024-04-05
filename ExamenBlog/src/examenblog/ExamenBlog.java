/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenblog;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan C. Jiménez
 */
public class ExamenBlog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ejercicio 3
        ArrayList<publicacion> blog = new ArrayList<publicacion>();
        
        blog.add(new publicacion(1,1,2024,"Asunto1","Texto1 caca","mortadelo"));
        blog.add(new publicacion(15,02,2024,"Asunto2","Texto2","filemon"));
        blog.add(new publicacion(23,12,2023,"Asunto3 pis","Texto3","bacterio"));
        blog.add(new publicacion(1,5,2023,"Asunto4","Texto4","rompetechos"));
        blog.add(new publicacion(11,3,2024,"Asunto5","Texto5","mortadelo"));
        //Fin del ejercicio 3
        //Ejercicio 4
        Collections.sort(blog);
        System.out.println(blog);
        //Fin del Ejercicio 4
        //Ejercicio 5
        ArrayList<String> participantes = new ArrayList<String>();
        for(publicacion p : blog){
            if(!participantes.contains(p.getAliasPropietario()))
                participantes.add(p.getAliasPropietario());
        }
        System.out.println(participantes);
        //Fin Ejercicio 5
        //Ejercicio 6
        //Apartado ii
        ArrayList<String> prohibidas = new ArrayList<String>();
        prohibidas.add("caca");
        prohibidas.add("pedo");
        prohibidas.add("culo");
        prohibidas.add("pis");
        //Apartado iii
        blog.removeIf(publi -> publi.esProhibido(prohibidas));
        System.out.println(blog);
        //Fin Ejercicio 6
        
        
    }
    
}
