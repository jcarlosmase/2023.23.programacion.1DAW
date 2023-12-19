/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasoParametros;

/**
 *
 * @author Juan C. Jiménez
 */
public class intercambio {
    public static void swap1(int a, int b){
        int temp=a;
        
        a=b;
        b=temp;
    }
    
    public static void swap2(int [] array){
        int temp = array[0];
        
        array[0]=array[1];
        array[1]=temp;
    }
}
