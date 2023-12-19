/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numperfecto;

/**
 *
 * @author Juan C. Jiménez
 */
public class NumPerfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numPerfectos = 3;
        int num = 3;
        int divisores,suma=0;
        
        do{
            //Compruebo si el número num es perfecto
            for(divisores=1;divisores<num;divisores++){
                if(num%divisores == 0){ //Es divisor
                    suma += divisores;
                }
            }
            if(suma==num){
                //He encontrado un número perfecto
                System.out.println(num+" es perfecto");
                numPerfectos--;
            }
            num++;
            suma=0;
        }while(numPerfectos>0);
    }
    
}
