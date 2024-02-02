/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telefonos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class compañia {
    private static final int numClientes = 100;
    private movil [] clientes;
    
    public compañia(String f) throws FileNotFoundException, IOException{
        String linea;
        String [] datos;
        int pos=0;
        
        try{
            //declaro el tamaño del array
            this.clientes = new movil[this.numClientes];
            //Creo un manejador de ficheros
            BufferedReader br = new BufferedReader(new FileReader(f));
            do{
                //Leo la linea
                linea = br.readLine();
                if(linea!=null){
                    //Proceso la linea
                    datos = linea.split(";"); //<- Divido en trozos la linea
                    this.clientes[pos] = new movil(datos[0],datos[1]); //<- construyo un móvil
                    this.clientes[pos].setDuracion(Integer.parseInt(datos[2]));//<- asigno duración
                    this.clientes[pos].setDinero(Double.parseDouble(datos[3]));//<- asigno dinero
                    pos++; //<- Preparo el índice para el siguiente móvil
                }
            }while(linea!=null);
            //Libero los recursos del fichero. Cierro el manejador
            br.close();
        }catch(FileNotFoundException fnf){
            throw fnf;
        }catch(IOException ioE){
            throw ioE;
        }
    }
    
    public String toString(){
        String datos = "";
        for (int i = 0; i < this.numClientes; i++) {
            if(this.clientes[i] != null){
                datos += (this.clientes[i] + "\n");
            }
        }
        return datos;
    }
}
