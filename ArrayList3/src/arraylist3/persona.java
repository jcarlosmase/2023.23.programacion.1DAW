/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist3;

/**
 *
 * @author Juan C. Jiménez
 */
public class persona implements Comparable<persona>{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    
    public persona(String n, String a1, String a2, int e){
        this.nombre = n;
        this.apellido1 = a1;
        this.apellido2 = a2;
        this.edad = e;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return this.apellido1 + " " + this.apellido2 + ", " + this.nombre;
    }
    
    @Override
    public int compareTo(persona p){
        if(this.apellido1.toLowerCase().compareTo(p.getApellido1().toLowerCase())==0){ //Mismo apellido1
            if(this.apellido2.toLowerCase().compareTo(p.getApellido2().toLowerCase())==0){ //Mismo apellido2
                return this.nombre.toLowerCase().compareTo(p.getNombre().toLowerCase());
            }else{ //Mismo apeliido 1 pero distinto apellido 2
                return this.apellido2.toLowerCase().compareTo(p.getApellido2().toLowerCase());
            }
        }else{//Apellido1 distinto
           return this.apellido1.toLowerCase().compareTo(p.getApellido1().toLowerCase()); 
        }
    }
}
