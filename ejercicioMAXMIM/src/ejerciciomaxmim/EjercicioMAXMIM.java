/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomaxmim;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class EjercicioMAXMIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float min=0, max=0, num;
        Scanner sc =new Scanner(System.in);
        
        for(int i=0;i<10;i++){
            System.out.println("Introduce el número "+i);
            num = sc.nextFloat();
            if(i==0){ //Este es el primer número
                max=num;
                min=num;
            }else{
                if(num>max){
                    max=num;
                }else{
                    if(num<min){
                        min=num;
                    }
                }
            }
            System.out.println("El máximo es " + max + " y el mínimo es " + min);
        }
    }
    
}
