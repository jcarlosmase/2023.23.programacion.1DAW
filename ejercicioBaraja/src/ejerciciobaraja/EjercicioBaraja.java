/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobaraja;

import java.util.HashMap;

/**
 *
 * @author Juan C. Jiménez
 */
public class EjercicioBaraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer, Integer> valores = new HashMap<Integer, Integer>();
        baraja b = new baraja();
        carta [] robadas = new carta[5]; 
        
        valores.put(1, 11); //As
        valores.put(3, 10); //Tres
        valores.put(10, 2); //Sota
        valores.put(11, 3); //Caballo
        valores.put(12, 4); //Rey
        
        b.barajar();
        b.cortar(Numeros.Aleatorio(0, 47));
        for (int i = 0; i < 5; i++) {
            robadas[i] = b.robar();
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println(robadas[i]);
        }
        
        System.out.println("Tienes ?? puntos");
    }
    
}
