/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package geometria;

/**
 *
 * @author Juan C. Jiménez
 */
public class Geometria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        figuraGeometrica f1; // Se puede declarar una clase abstracta
        //f1 = new figuraGeometrica("cuadrado"); // NO se puede instanciar una clase abstracta
        f1 = new circulo(5); // POLIMORFISMO
        System.out.println("El área de esta figura es: " + f1.area()); //LIGADURA DINÁMICA
        System.out.println(f1); //LIGADURA DINÁMICA
        //f1.getRadio(); // No se puede porque f1 es una figuraGeometrica
    }
    
}
