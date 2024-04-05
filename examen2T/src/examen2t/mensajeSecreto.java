/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class mensajeSecreto {
    private static final int maxLong = 100;
    private vocal[] texto;
    
    public mensajeSecreto(String fichero) throws FileNotFoundException, IOException, letraNoSoportada{
        this.texto = new vocal[maxLong];
        BufferedReader br = new BufferedReader(new FileReader(fichero));
        String linea;
        int pos = 0;
        do{
            linea = br.readLine();
            if(linea!=null){
                if(linea.charAt(0)=='.' || linea.charAt(0)=='-')
                    this.texto[pos] = new morse(linea); //<-Polimorfismo
                else if(linea.charAt(0)=='0' || linea.charAt(0)=='1')
                    this.texto[pos] = new binario(linea); //<-Polimorfismo
                else if(linea.charAt(0)=='a' ||
                        linea.charAt(0)=='e' ||
                        linea.charAt(0)=='i' ||
                        linea.charAt(0)=='o' ||
                        linea.charAt(0)=='u')
                    this.texto[pos] = new hexadecimal(linea); //<-Polimorfismo
                else throw new letraNoSoportada();
            pos++;
            }
        }while(linea!=null);
        br.close();
    }
    
    public String decodificar(){
        String resul="";
        
        for (int i = 0; i < this.maxLong; i++) {
            if(this.texto[i]!=null){
                resul += this.texto[i].getValor();
            }
        }
        return resul;
    }
    
    public String codificar(){
        String resul="";
        
        for (int i = 0; i < this.maxLong; i++) {
            if(this.texto[i] != null){
                resul += this.texto[i].getCodigo() + "\n";
            }
        }
        return resul;
    }
}
