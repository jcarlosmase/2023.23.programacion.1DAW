/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia1;

/**
 *
 * @author Juan C. Jiménez
 */
public class Herencia1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        persona p1 = new persona("11111111A","Pepillo","El de los palotes",80.2f,15);
        
        System.out.println(p1);
        
        policia poli1 = new policia("22222222B","Lola","Flores",70.3f,45,"Cabo",12345);
        
        System.out.println(poli1);
    }
    
}
