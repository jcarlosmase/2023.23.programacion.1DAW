/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandotostring;

/**
 *
 * @author Juan C. Jiménez
 */
public class Cuadrado {

    private int lado;
    private static int numCuadrados=0;

    public Cuadrado(int l) {
        this.lado = l;
        this.numCuadrados++;
    }
    
    public static void metodo1(){
        System.out.println("El objeto no ha sido construido todavia");
    }
    
    public static boolean compuebaDNI(int num, char letra){
        return true;
    }
    
    public int getnumCuadrados(){
        return this.numCuadrados;
    }
    
    public int getLado(){
        return this.lado;
    }

    public String toString() {
        int i, espacios;
        String resultado = "";
        
        for (i = 0; i < this.lado; i++) {
            resultado += "*";
        }
        resultado += "\n";
        for (i = 1; i < this.lado - 1; i++) {
            resultado += "*";
            for (espacios = 1; espacios < this.lado - 1; espacios++) {
                resultado += " ";
            }
            resultado += "*\n";
        }
        for (i = 0; i < this.lado; i++) {
            resultado += "*";
        }
        resultado += "\n";
        return resultado;
    }
}
