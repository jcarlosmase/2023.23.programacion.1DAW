/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3t;

/**
 *
 * @author usuario
 */
public abstract class pregunta {
    private String tipo;
    
    public pregunta(String Atipo){
        this.tipo = Atipo;
    }
    
    public abstract int preguntar(); 
}
