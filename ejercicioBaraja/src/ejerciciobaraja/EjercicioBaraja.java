/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciobaraja;

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
        /*carta c1=new carta(1,'O');
        carta c2=new carta(10,'E');
        System.out.println(c1);
        System.out.println(c2);*/
        
        baraja b1 = new baraja();
        carta [] tres = new carta[3];
       
        /*b1.barajar();
        b1.cortar(20);
        System.out.println("ANTES");
        System.out.println(b1);
        System.out.println("ROBA");
        System.out.println(b1.robar());
        System.out.println("DESPUES");
        System.out.println(b1);*/
        b1.eligeCartas(tres);
        System.out.println(tres[0]);
        System.out.println(tres[1]);
        System.out.println(tres[2]);
        System.out.println("BARAJA");
        System.out.println(b1);
    }
    
}
