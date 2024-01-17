/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Juan C. Jiménez
 */
public class publicacion {

    private String ISBN;
    private String titulo;
    private int año;
    
    public publicacion(String i, String t, int a){
        this.ISBN = i;
        this.titulo = t;
        this.año = a;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAño() {
        return año;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAño(int año) {
        this.año = año;
    }
    
    public String toString(){
       
        return "ISBN: " + this.ISBN + 
               ", título: " + this.titulo + 
               ", año de publicación: " + this.año;
    }
}
