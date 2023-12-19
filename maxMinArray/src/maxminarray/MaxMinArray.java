/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maxminarray;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class MaxMinArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float [] numeros = new float[10];
        Scanner sc =new Scanner(System.in);
        float max=0f,min=0f;
        int i;
        
        //Leer los datos
        for(i=0;i<10;i++){
            System.out.println("Dime el numero "+(i+1));
            numeros[i]=sc.nextFloat();
        }
        for(i=0;i<10;i++){
            if(i==0){ //Estoy en la primera posicion del array
                max = min = numeros[i];
            }else{ //No estoy en la primera posicion del array
                if(numeros[i]>max){
                    max=numeros[i];
                }
                if(numeros[i]<min){
                    min=numeros[i];
                }
            }
        }
        System.out.println("El máximo es: "+max);
        System.out.println("El mínimo es: "+min);
    }
    
}
