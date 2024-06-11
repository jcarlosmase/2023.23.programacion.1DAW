/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion4;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("PRIMERA PARTE DEL EJERCICIO");
        CuentaCorriente cuenta1 = new CuentaCorriente();
        CuentaCorriente cuenta2 = new CuentaCorriente(1500);
        CuentaCorriente cuenta3 = new CuentaCorriente(6000);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        cuenta1.ingreso(2000);
        cuenta2.cargo(600);
        cuenta3.ingreso(75);
        cuenta1.cargo(55);
        cuenta2.transferencia(cuenta3, 100);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        
        System.out.println("\n\nSEGUNTA PARTE DEL EJERCICIO");
        
        CuentaAhorro cuenta4 = new CuentaAhorro(2);
        CuentaHipotecados cuenta5 = new CuentaHipotecados(1500,1.5f);

        System.out.println(cuenta4);
        System.out.println(cuenta5);

        cuenta4.ingreso(2000);
        cuenta5.cargo(600);
        cuenta4.cargo(55);
        cuenta5.transferencia(cuenta4, 100);

        System.out.println(cuenta4);
        System.out.println(cuenta5);
    }
    
}
