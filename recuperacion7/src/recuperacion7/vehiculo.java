/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recuperacion7;

/**
 *
 * @author Juan C. Jiménez
 */
public class vehiculo {
    private String marca;
    private String modelo;
    private int kms;
    private float peso;

    public vehiculo(String marca, String modelo, int kms, float peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.kms = kms;
        this.peso = peso;
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

    public int getKms() {
        return kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", kms=" + kms + ", peso=" + peso + '}';
    }
    
}
