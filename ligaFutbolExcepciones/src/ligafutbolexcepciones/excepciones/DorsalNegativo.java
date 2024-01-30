/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligafutbolexcepciones.excepciones;

/**
 *
 * @author Juan C. Jiménez
 */
public class DorsalNegativo extends Exception{
    
    public DorsalNegativo(){
        System.out.println("No se permiten dorsales negativos en la liga");
    }
    
}
