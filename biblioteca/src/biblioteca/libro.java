/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Juan C. Jiménez
 */
public class libro extends publicacion implements prestable {
    private boolean prestado;
    
    public libro(String i, String t, int a){
        super(i,t,a);
        this.prestado = false;
    }
    
    @Override
    public void presta() {
        this.prestado = true;
    }

    @Override
    public void devuelve() {
        this.prestado = false;
    }

    @Override
    public boolean estaPrestado() {
        return this.prestado;
    }
    
    @Override
    public String toString(){
        return super.toString() + (this.prestado?" (prestado)":" (no prestado)");
    }
    
}
