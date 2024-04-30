/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecahashmap;

import java.util.HashMap;

/**
 *
 * @author Juan C. Jiménez
 */
public class biblioteca {
    private HashMap<String, libro> ejemplares;
    
    public biblioteca(){
        this.ejemplares = new HashMap<String, libro>();
    }
    
    public void ADD(libro l, String signatura){
        this.ejemplares.put(signatura, l);
    }
    
    public void prestar(String signatura, prestamo p){
        this.ejemplares.get(signatura).prestar(p);
    }
    
    public boolean estaPrestado(String signatura){
        return true;
    }
    
    public int numEjemplares(String ISBN){
        return 0;
    }
}
