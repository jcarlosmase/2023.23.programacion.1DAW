/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2t;

/**
 *
 * @author Juan C. Jiménez
 */
public class letraNoSoportada extends Exception{
    /*public letraNoSoportada(){
        System.out.println("Por favor, introduzca una vocal a, e, i, o, u");
    }*/
    
    @Override
    public String getMessage(){
        return "Por favor, introduzca una vocal a, e, i, o, u";
    }
}
