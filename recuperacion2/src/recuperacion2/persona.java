/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2;

/**
 *
 * @author Juan C. Jiménez
 */
public class persona {
    private String nombre;
    private String Apellidos;
    private int edad;

    public persona(String nombre, String Apellidos, int edad) {
        this.nombre = nombre;
        this.Apellidos = Apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "persona{" + "nombre=" + nombre + ", Apellidos=" + Apellidos + ", edad=" + edad + '}';
    }
    
    public static boolean esMayorEdad(int edad){
        /*if(edad>=18){
            return true;
        }else{
            return false;
        }
        */
        
        /*if(edad>=18)
            return true;
        else
            return false;
        */
        
        /*if(edad>=18)
            return true;
        return false;
        */
        
        //return ((edad>=18)?true:false);
        
        return edad>=18;
    }
}
