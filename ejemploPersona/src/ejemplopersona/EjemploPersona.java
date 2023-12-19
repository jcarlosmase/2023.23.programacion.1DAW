/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplopersona;

/**
 *
 * @author Juan C. Jiménez
 */
public class EjemploPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        persona p1 = null;
        if(p1.compruebaDNI(12345678,'Z')){
            p1 = new persona(12345678,'Z',"Manolo","El Del","Bombo");
        }
    }
    
}
