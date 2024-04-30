/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecahashmap;

/**
 *
 * @author Juan C. Jiménez
 */
public class BibliotecaHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        biblioteca b1 = new biblioteca();
        
        b1.ADD(new libro("11111","El Quijote","Miguel de Cervantes",100), "QUI-24-01");
        b1.ADD(new libro("11111","El Quijote","Miguel de Cervantes",100), "QUI-24-02");
        b1.ADD(new libro("11111","El Quijote","Miguel de Cervantes",100), "QUI-24-03");
        b1.ADD(new libro("22222","Programación en Java","Juan C. Jiménez",200), "JAVA-24-01");
        
        b1.prestar("QUI-24-01", new prestamo(20240430,"Pepillo Palotes"));
        
        if(b1.estaPrestado("QUI-24-01"))
            System.out.println("Esta prestado");
        else
            System.out.println("NO esta prestado");
        
        System.out.println("Hay " + b1.numEjemplares("11111") + " ejemplares del Quijote");
    }
    
}
