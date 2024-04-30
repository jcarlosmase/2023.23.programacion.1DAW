/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecahashmap;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private int nPag;
    private ArrayList<prestamo> prestamos;

    public libro(String ISBN, String titulo, String autor, int nPag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.nPag = nPag;
        this.prestamos = new ArrayList<prestamo>();
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPag() {
        return nPag;
    }

    public void setnPag(int nPag) {
        this.nPag = nPag;
    }
    
    public void prestar(prestamo p){
        this.prestamos.add(p);
    }

    @Override
    public String toString() {
        return "libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", nPag=" + nPag + '}';
    }
    
}
