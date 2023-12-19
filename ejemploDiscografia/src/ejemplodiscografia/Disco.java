/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplodiscografia;

/**
 *
 * @author Juan C. Jiménez
 */
public class Disco {

    private static int numDiscos=0;
    private String codigo = "LIBRE";
    private String autor;
    private String titulo;
    private String genero;
    private int duracion; // duración total en minutos

    public Disco(String a, String t, String g, int d){
        this.autor = a;
        this.titulo = t;
        this.genero = g;
        this.duracion = d;
        this.numDiscos++;
        this.codigo = String.valueOf(a.charAt(0)) + String.valueOf(t.charAt(0)) + String.valueOf(g.charAt(0)) + this.numDiscos;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String toString() {
        String cadena = "\n------------------------------------------";
        cadena += "\nCódigo: " + this.codigo;
        cadena += "\nAutor: " + this.autor;
        cadena += "\nTítulo: " + this.titulo;
        cadena += "\nGénero: " + this.genero;
        cadena += "\nDuración: " + this.duracion;
        cadena += "\n------------------------------------------";
        return cadena;
    }

}
