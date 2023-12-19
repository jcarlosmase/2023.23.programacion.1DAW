/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematicas;

/**
 *
 * @author Juan C. Jiménez
 */
public class numeros {
    public static boolean esCapicua(int numero){
        /*int volteado = voltea(numero);
        
        if(numero==volteado){
            return true;
        }else{
            return false;
        }*/
        return numero==voltea(numero);
    }
    
    public static boolean esPrimo(int numero){
        for (int i = 2; i < numero; i++) {
            if(numero%i==0){
                return false;
            }
        }
        return true;
    }
    
    public static int siguientePrimo(int numero){
        int siguiente=numero+1;
        
        while(!esPrimo(siguiente)){
           siguiente++; 
        }
        return siguiente;
    }
    
    public static int potencia(int base, int exponente){
        int resultado=1;
        
        for (int i = 0; i < exponente; i++) {
            resultado*=base;
        }
        return resultado;
    }
    
    public static int digitos(int numero){
        int ndigitos=0;
        
        while(numero!=0){
            numero/=10;
            ndigitos++;
        }
        return ndigitos;
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
    
    public static int digitoN(int numero, int pos){
        //int num2=quitarporDelante(numero,pos);
        int resul=quitaporDetras(numero,digitos(numero)-pos-1);
        return resul%10;
    }
    
    public static int posiciondeDigito(int numero, int digito){
        return 0;
    }
    
    public static int quitaporDetras(int numero, int nDigitos){
        int num = numero;
        
        if(digitos(numero)<nDigitos){
            return -1;
        }else{
            for (int i = 0; i < nDigitos; i++) {
                num /= 10;
            }
            return num;
        }
    }
    public static int quitarporDelante(int numero, int nDigitos){
        int num2 = voltea(numero);
        int num3 = quitaporDetras(num2,nDigitos);
        int num4 = voltea(num3);
        return num4;
    }
    
    public static int pegaporDetras(int numero, int digito){
        return 0;
    }
    
    public static int pegaporDelante(int numero, int digito){
        /*
        int num2=voltea(numero);
        int num3=pegaporDetras(num2,digito);
        int num4=voltea(num3);
        return num4;
        */
        return voltea(pegaporDetras(voltea(numero),digito));
    }
    
    public static int trozodeNumero(int numero, int Pinicial, int Pfinal){
        /*int num2=quitarporDelante(numero,Pinicial);
        int num3=quitaporDetras(num2,Pfinal);
        
        return num3;*/
        return quitaporDetras(quitarporDelante(numero,Pinicial),Pfinal);
    }
    
    public static int juntaNumeros(int num1, int num2){
        return (num1*potencia(10,digitos(num2))) + num2;
    }   
}
