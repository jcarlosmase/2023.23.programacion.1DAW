/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cambiosn;
import java.util.Scanner;
import matematicas.numeros;

/**
 *
 * @author Juan C. Jiménez
 */
public class CambioSN {

    /**
     * @param args the command line arguments
     */
    /*public static int pasarDecimal(int numero, int base){
        int resultado=0;
        
        if(base<10){
            for (int i = 0; i < numeros.digitos(numero); i++) {
                resultado += (numeros.digitoN(numero, i)*numeros.potenca(base,i));
            }
            return resultado;
        }else{
            return numero;
        }
    }*/
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        /*int binario;
        int decimal=0;
        
        System.out.println("Dime un número en binario");
        binario=sc.nextInt();
        for (int i = 0; i < numeros.digitos(binario); i++) {
            if(i>0)
                System.out.print(" + ");
            System.out.print(numeros.digitoN(binario, i));
            System.out.print("x2^");
            System.out.print(numeros.digitos(binario)-i-1);
            decimal+=(numeros.digitoN(binario, i)*numeros.potencia(2, numeros.digitos(binario)-i-1));
        }
        System.out.println(" = "+decimal);
        */
        int decimal;
        int cociente;
        int resto;
        int binario=0;
        
        System.out.println("Dime un número en decimal");
        decimal=sc.nextInt();
        cociente=decimal/2;
        resto=decimal%2;
        do{
            binario = numeros.pegaporDelante(binario, resto);
            resto=cociente%2;
            cociente=cociente/2;
        }while(cociente>=2);
        binario = numeros.pegaporDelante(binario, cociente);
        
    }
    
}
