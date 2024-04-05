/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist1;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class ArrayList1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    try{
        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add(0,"Morado");
        arr1.add("rojo");
        arr1.add(2,"azul");
        arr1.remove(2);
        arr1.add(2,"amarillo");
        arr1.add("rojo");
        arr1.removeIf(color -> color.contains("a") && color.length() <=6 );
        //arr1.add(10,"Morado");
        System.out.println(arr1);
        
        String cosa="Hola clase";
        cosa.contains("clase");

        /*for(String color : arr1){
            System.out.println(color);
        }*/
    }catch(Exception e){
        System.out.println(e.getMessage());
    }
    }
}
