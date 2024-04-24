/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ropaabstracta;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class RopaAbstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<cliente> cartera = new ArrayList<cliente>();
        
        cartera.add(new clienteA(5000,"CL001","Pepillo","Palotes"));
        cartera.add(new clienteA(15000,"CL002","Luis","Fernández"));
        cartera.add(new clienteC(2500,"CL003","Ana","Pérez"));
        cartera.add(new clienteB(115000,"CL004","Bea","Jiménez"));
        cartera.add(new clienteC(100,"CL005","Juan","Martínez"));
        cartera.add(new clienteB(111111,"CL006","Pedro","Pérez"));
        
        for(cliente c : cartera){
            System.out.println(c + " TOTAL COBRADO: " + c.aplicarDescuento() + "€");
        }
    }
    
}
