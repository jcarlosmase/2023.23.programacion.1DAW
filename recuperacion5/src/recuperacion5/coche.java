/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Juan C. Jiménez
 */
public class coche {
    private String marca;
    private String modelo;
    private String color;

    public coche(String marca, String modelo, String color) throws noCochesAmarillos{
        if(!color.toLowerCase().equals("amarillo")){
            this.marca = marca;
            this.modelo = modelo;
            this.color = color;
        }else{
            throw new noCochesAmarillos();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) throws noCochesAmarillos {
        if(!color.toLowerCase().equals("amarillo")){
            this.color = color;
        }else{
            throw new noCochesAmarillos();
        }
    }

    @Override
    public String toString() {
        return "coche{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + '}';
    }
    
}
