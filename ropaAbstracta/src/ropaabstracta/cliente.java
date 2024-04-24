/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ropaabstracta;

/**
 *
 * @author Juan C. Jiménez
 */
public abstract class cliente {
    private String cod;
    private String nombre;
    private String apellidos;

    public cliente(String cod, String nombre, String apellidos) {
        this.cod = cod;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getCod() {
        return cod;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "cliente{" + "cod=" + cod + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
    
    public abstract String aplicarDescuento();
    
}
