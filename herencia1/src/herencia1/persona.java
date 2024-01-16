/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia1;

/**
 *
 * @author Juan C. Jiménez
 */
public class persona {
    private String DNI;
    private String nombre;
    private String apellidos;
    private float peso;
    private int edad;
    
    public persona(String d, String n, String a, float p, int e){
        this.DNI = d;
        this.nombre = n;
        this.apellidos = a;
        this.peso = p;
        this.edad = e;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public float getPeso() {
        return peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString(){
        String aux;
        aux = "Datos personales\n";
        aux += "------------------\n";
        aux += "DNI: " + this.DNI + "\n";
        aux += "Nombre: " + this.nombre + this.apellidos + "\n";
        aux += "Peso: " + this.peso + "\n";
        aux += "Edad: " + this.edad + "\n";
        return aux;
    }
    
}
