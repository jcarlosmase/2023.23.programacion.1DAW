/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion2;

/**
 *
 * @author Juan C. Jiménez
 */
public class alumno {
    private String nombre;
    private String apellidos;
    private static float beca = 500;

    public alumno(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public float getBeca() {
        return beca;
    }

    public void setBeca(float beca) {
        alumno.beca = beca;
    }

    @Override
    public String toString() {
        return "alumno{" + "nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }
}
