/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecahashmap;

/**
 *
 * @author Juan C. Jiménez
 */
public class prestamo {
    private int fechaSalida;
    private int fechaDev;
    private String nombSocio;
    private int multa;

    public prestamo(int fechaSalida, String nombSocio) {
        this.fechaSalida = fechaSalida;
        this.nombSocio = nombSocio;
        this.multa = 0;
        this.fechaDev = 0;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getFechaDev() {
        return fechaDev;
    }

    public void devolver(int fechaDev) {
        this.fechaDev = fechaDev;
    }

    public String getNombSocio() {
        return nombSocio;
    }

    public void setNombSocio(String nombSocio) {
        this.nombSocio = nombSocio;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "prestamo{" + "fechaSalida=" + fechaSalida + ", fechaDev=" + fechaDev + ", nombSocio=" + nombSocio + ", multa=" + multa + '}';
    }
}
