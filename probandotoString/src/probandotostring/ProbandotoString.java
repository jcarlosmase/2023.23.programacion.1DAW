/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandotostring;

/**
 *
 * @author Juan C. Jiménez
 */
public class ProbandotoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuadrado c1 = new Cuadrado(5);
        Cuadrado c2 = new Cuadrado(10);
        Cuadrado c3 = new Cuadrado(3);

        
        System.out.println(c1.getLado());
        System.out.println(c1.getnumCuadrados());
        System.out.println(c2.getLado());
        System.out.println(c2.getnumCuadrados());
        System.out.println(c3.getLado());
        System.out.println(c3.getnumCuadrados());
        
        Cuadrado c4 = null;
        c4.metodo1();
        
        c4 = new Cuadrado(4);
        System.out.println(c4.getLado());
        System.out.println(c4.getnumCuadrados());
        
        System.out.println(c4);
        
        Cuadrado c5 = null;
        if(c5.compuebaDNI(12345678,'Z')){
            c5 = new Cuadrado(10);
        }
    }
    
}
