/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primos;

/**
 *
 * @author Juan C. Jiménez
 */
public class Primos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] numeros = new int[100];
        int primo=2,pos;
        
        //inicializo el array
        for(int i=0;i<=100;i++){
            numeros[i]=i;
        }
        //aplico el algoritmo de la criba de eratóstenes
        for(int i = primo;i<100;i+=primo){
            if(i!=primo){
                numeros[i]=0; //Borrado lógico
            }
        }
        //busco el siguiente primo
        pos=primo+1;
        do{
            primo=numeros[pos];
            pos=pos+1;
        }while(primo!=0);
    }
    
}
