/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exploradorpersonas;

/**
 *
 * @author Juan C. Jiménez
 */
public class persona {
    private String DNI;
    private String Nombre;
    private String apellidos;
    private String direccion;
    private boolean sexo; //radio
    private String[] aficiones;//Checkbox
    private boolean mayorEdad; //Combo

    public persona(String DNI, String Nombre, String apellidos, String direccion, boolean sexo, String[] aficiones, boolean mayorEdad) {
        this.DNI = DNI;
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.sexo = sexo;
        this.aficiones = aficiones;
        this.mayorEdad = mayorEdad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean isSexo() {
        return sexo;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public String[] getAficiones() {
        return aficiones;
    }

    public void setAficiones(String[] aficiones) {
        this.aficiones = aficiones;
    }

    public boolean isMayorEdad() {
        return mayorEdad;
    }

    public void setMayorEdad(boolean mayorEdad) {
        this.mayorEdad = mayorEdad;
    }
    
    
}
