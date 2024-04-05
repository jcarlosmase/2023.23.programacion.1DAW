/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diccionarios1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan C. Jiménez
 */
public class Diccionarios1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Definición del diccionario
        HashMap<String, Integer> d1 = new HashMap<String, Integer>();
        ArrayList<Integer> prueba = new ArrayList<Integer>();
        
        prueba.add(1);
        prueba.add(2);
        prueba.add(3);
        prueba.set(1, 100);
        prueba.add(1, 1000);
        System.out.println(prueba);
        
        
        //Inserción de datos
        d1.put("hola", -50);
        d1.put("adios", 45);
        d1.put("cosa", 0);
        d1.put("cuando", 100);
        d1.put("cuando", 1000);
        d1.put("cuando2", 1000);
        
        //Recorrido de un diccionario completamente
        System.out.println(d1);
        System.out.println("Recorrido 1:");
        for(Map.Entry pareja: d1.entrySet()){
            System.out.println(pareja.getKey() + " -> " + pareja.getValue());
            //System.out.println(pareja);
        }
        
        //Mostrar sólo los valores positivos
        System.out.println("Recorrido 2:");
        for(Map.Entry pareja: d1.entrySet()){
            if(Integer.parseInt(pareja.getValue().toString()) >= 0){
                System.out.println(pareja.getKey() + " -> " + pareja.getValue());
            }
        }
        
        //Mostrar sólo los elementos cuya clave contenga la letra 'a'
        System.out.println("Recorrido 3:");
        for(Map.Entry pareja: d1.entrySet()){
            if(pareja.getKey().toString().contains("a")){
                System.out.println(pareja.getKey() + " -> " + pareja.getValue());
            }
        }
        
        //Mostrar sólo los elementos cuya clave empiece por la letra 'a'
        System.out.println("Recorrido 4:");
        for(Map.Entry pareja: d1.entrySet()){
            if(pareja.getKey().toString().startsWith("a")){
                System.out.println(pareja.getKey() + " -> " + pareja.getValue());
            }
        }
        
        //Obtener un valor concreto de un diccionario
        System.out.println("Obtener un valor concreto");
        System.out.println(d1.get("hola"));
        
        //Probando mas formas de recorrer un diccionario
        System.out.println("Mostrando el diccionario con emtrySet");
        System.out.println(d1.entrySet());
    }
}
   
