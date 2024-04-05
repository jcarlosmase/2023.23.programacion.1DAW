/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ajedrez;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan C. Jiménez
 */
public class Ajedrez {

    public static int Aleatorio(int desde, int hasta) {
        return (int) (Math.random() * (hasta - desde + 1) + desde);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] figuras = {"dama", "caballo", "torre", "alfil", "peon"};
        HashMap<String, Integer> puntos = new HashMap<String, Integer>();
        puntos.put("dama", 9);
        puntos.put("caballo", 2);
        puntos.put("torre", 5);
        puntos.put("alfil", 3);
        puntos.put("peon", 1);
        HashMap<String, Integer> ganados = new HashMap<String, Integer>();
        int nFiguras; // Del 1 al 15
        int figura;   // Del 0 al 4
        int nPeones = 0; // Nº de peones ganados
        
        nFiguras = Aleatorio(1,15);
        do{
            figura = Aleatorio(0, 4);
            if(ganados.containsKey(figuras[figura])){
                switch(figura){
                    case 0: //dama
                        if(ganados.get(figuras[figura]) < 1){
                            ganados.put(figuras[figura],ganados.get(figuras[figura]) + 1);
                            nFiguras--;
                        }
                        break;
                    case 1: //caballo
                        if(ganados.get(figuras[figura]) < 2){
                            ganados.put(figuras[figura],ganados.get(figuras[figura]) + 1);
                            nFiguras--;
                        }
                        break;
                    case 2: //torre
                        if(ganados.get(figuras[figura]) < 2){
                            ganados.put(figuras[figura],ganados.get(figuras[figura]) + 1);
                            nFiguras--;
                        }
                        break;
                    case 3: //alfil
                        if(ganados.get(figuras[figura]) < 2){
                            ganados.put(figuras[figura],ganados.get(figuras[figura]) + 1);
                            nFiguras--;
                        }
                        break;
                    case 4: //peon
                        if(ganados.get(figuras[figura]) < 8){
                            ganados.put(figuras[figura],ganados.get(figuras[figura]) + 1);
                            nFiguras--;
                        }
                        break;
                }
            }else{
                ganados.put(figuras[figura], 1);
                nFiguras--;
            }
        }while(nFiguras > 0);
        
        //Muestro las figuras ganadas
        for(Map.Entry par : ganados.entrySet()){
            System.out.println(par.getKey() + ": " + par.getValue());
        }
        //Calculo y muestro los puntos
        for(Map.Entry par : ganados.entrySet()){
            nPeones += (Integer.parseInt(par.getValue().toString()) * puntos.get(par.getKey()));
        }
        System.out.println("Nº de peones: " + nPeones);
    }
}
