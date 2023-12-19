/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplopersona;

/**
 *
 * @author Juan C. Jiménez
 */
public class persona {
    private int numDNI;
    private char letraDNI;
    private String nombre;
    private String apellido1;
    private String apellido2;
    
    //metodos static
    public static boolean compruebaDNI(int nD, char lD){
        return true;
    }
    
    public persona(int nD, char lD, String n, String a1, String a2){
        this.numDNI = nD;
        this.letraDNI = lD;
        this.nombre = n;
        this.apellido1 = a1;
        this.apellido2 = a2;
    }
    
    public int getnumDNI(){
        return this.numDNI;
    }
    public char getletraDNI(){
        return this.letraDNI;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getApellido1(){
        return this.apellido1;
    }
    public String getApellido2(){
        return this.apellido2;
    }
    public void setnumDNI(int nD){
        this.numDNI = nD;
    }
}
