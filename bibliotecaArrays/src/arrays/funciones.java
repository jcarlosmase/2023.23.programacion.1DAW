/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arrays;

/**
 *
 * @author Juan C. Jiménez
 */
public class funciones {
    public static int Aleatorio(int desde, int hasta){
        return (int)(Math.random()*(hasta-desde+1)+desde);
    }
    
    public static void generaArrayInt(int [] a, int min, int max){
        for (int i = 0; i < a.length; i++) {
            a[i] = Aleatorio(min,max);
        }
    }
    
    public static int minimoArrayInt(int [] a){
        int minimo = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if(a[i] < minimo)
                minimo = a[i];
        }
        return minimo;
    }
}
