/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion4;

/**
 *
 * @author Juan C. Jiménez
 */
public class Numeros {

    public static int Aleatorio(int desde, int hasta){
        return (int)(Math.random()*(hasta-desde+1)+desde);
    }
    
    //Función esCapicua: Devuelve verdadero si el número que se pasa
    //como parámetro es capicúa y falso en caso contrario
    public static boolean esCapicua(int num){
        return (num==voltea(num));
    }
    
    public static boolean esPrimo(int num){
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int siguientePrimo(int num){
        int siguiente=num + 1;
        
        while(!esPrimo(siguiente)){
            siguiente++;
        }
        return siguiente;
    }
    
    public static float potencia(int base, int exponente){
        float p=base;
        
        if(exponente==0){
            p=1;
        }else if(exponente>0){
            for (int i = 1; i < exponente; i++) {
                p*=base;
            }
        }else{
            for (int i = 1; i < exponente*(-1); i++) {
                p*=base;
            }
            if(p!=0)
                p=1/p;
            else
                System.out.println("ERROR. División entre 0");
        }
        return p;
    }
    
    public static int digitos(int num){
        int nDigitos=0;
        
        if(num==0){
            nDigitos=1;
        }else{
            while(num!=0){
                num/=10;
                nDigitos++;
            }
        }
        return nDigitos;
    }
    
    public static int voltea(int num){
        int digito,temp;
        int numeroCapicuo=0;
        int num2=num;
        
        while(num2>0){
            temp = num2;
            num2/=10;
            digito=temp-(num2*10);
            if(numeroCapicuo!=0){
                numeroCapicuo*=10;                
            }
            numeroCapicuo+=digito;
        }
        return numeroCapicuo;        
    }
    //de izquierda a derecha y de 0 a n-1. Ejemplo: en el numero 1423 en 4 ocupa la posición 1
    public static int digitoN(int numero, int posicion){
        int nDigitos=digitos(numero);
        int temp=numero;
        
        if(posicion+1>nDigitos){
            return -1;
        }
        for (int i = 0; i <= posicion; i++) {
            
        }
        return 0;
    }
    
    public static int posicionDeDigito(int num, int digito){
        return 0;
    }
    
    public static int quitaPorDetras(int num, int numDigitos){
        int nDigitos=digitos(num);
        int temp=num;
        int potencia10 = 1;
        
        if(numDigitos>nDigitos){
            return -1;
        }
        for (int i = 0; i < numDigitos; i++) {
            potencia10*=10;
        }
        return num/potencia10;
    }
}
