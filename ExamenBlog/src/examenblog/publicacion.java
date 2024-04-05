/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenblog;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class publicacion implements Comparable<publicacion>{
    
    private Integer diaPublicacion;
    private Integer mesPublicacion;
    private Integer añoPublicacion;
    private String asunto;
    private String texto;
    private String aliasPropietario;

    public publicacion(Integer diaPublicacion, Integer mesPublicacion, Integer añoPublicacion, String asunto, String texto, String aliasPropietario) {
        this.diaPublicacion = diaPublicacion;
        this.mesPublicacion = mesPublicacion;
        this.añoPublicacion = añoPublicacion;
        this.asunto = asunto;
        this.texto = texto;
        this.aliasPropietario = aliasPropietario;
    }

    public Integer getDiaPublicacion() {
        return diaPublicacion;
    }

    public Integer getMesPublicacion() {
        return mesPublicacion;
    }

    public Integer getAñoPublicacion() {
        return añoPublicacion;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getTexto() {
        return texto;
    }

    public String getAliasPropietario() {
        return aliasPropietario;
    }

    public void setDiaPublicacion(Integer diaPublicacion) {
        this.diaPublicacion = diaPublicacion;
    }

    public void setMesPublicacion(Integer mesPublicacion) {
        this.mesPublicacion = mesPublicacion;
    }

    public void setAñoPublicacion(Integer añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public void setAliasPropietario(String aliasPropietario) {
        this.aliasPropietario = aliasPropietario;
    }

    @Override
    public String toString() {
        return "publicacion{" + "diaPublicacion=" + diaPublicacion + ", mesPublicacion=" + mesPublicacion + ", a\u00f1oPublicacion=" + añoPublicacion + ", asunto=" + asunto + ", texto=" + texto + ", aliasPropietario=" + aliasPropietario + "}\n";
    }

    @Override
    public int compareTo(publicacion o) {
        if(this.añoPublicacion>o.getAñoPublicacion())
            return -1;
        if(this.añoPublicacion<o.getAñoPublicacion())
            return 1;
        if(this.mesPublicacion>o.getMesPublicacion())
            return -1;
        if(this.mesPublicacion<o.getMesPublicacion())
            return 1;
        if(this.diaPublicacion>o.getDiaPublicacion())
            return -1;
        if(this.diaPublicacion<o.getDiaPublicacion())
            return 1;
        return 0;
    }
    public boolean esProhibido(ArrayList<String> palabras){
        for(String palabra : palabras){
            if(this.asunto.contains(palabra) || this.texto.contains(palabra))
                return true;
        }
        return false;
    }
}
