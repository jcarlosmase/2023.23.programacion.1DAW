/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author Juan C. Jiménez
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Bucle mientras
           while(condición){
                Bloque de instrucciones (cuerpo)
           }
        */
        int contador;
        contador = 0;
        
        while(contador>0){
            System.out.println("Hola");
            contador=contador-1;
        }
        contador = 0;
        /*Bucle repetir mientras*/
        do{
            System.out.println("Adios");
            contador--; /*LO MISMO QUE contador=contador-1; */
        }while(contador>0);
        /*Bucle repetir para*/
        for(contador=0;contador<=10;contador++){
            //System.out.println("fin");
            System.out.println("5x"+contador+"="+5*contador);
        }
    }
    
}
