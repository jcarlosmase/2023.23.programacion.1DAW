/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3t;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class juegoPreguntas {
    private ArrayList<pregunta> preguntas;
    private int puntuacion;
    
    public juegoPreguntas(String rutaFichero) throws FileNotFoundException, IOException{
        BufferedReader bf = new BufferedReader(new FileReader(rutaFichero));
        String linea;
        
        this.preguntas = new ArrayList<pregunta>();
        this.puntuacion = 0;
        do{
            linea = bf.readLine();
            if(linea!=null){
                switch(linea){
                    case "[test]" -> {
                        String enunciado = bf.readLine();
                        String [] respuestas = {bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine()};
                        int respCorrecta = Integer.parseInt(bf.readLine());
                        this.preguntas.add(new preguntaTest(enunciado,respuestas,respCorrecta));
                    }
                    case "[vf]" -> this.preguntas.add(new preguntaVF(bf.readLine(),bf.readLine().equals("V")));
                    case "[pistas]" -> {
                        String [] pistas = {bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine(),bf.readLine()};
                        String correcta = bf.readLine();
                        this.preguntas.add(new preguntaPistas(pistas,correcta));
                    }
                }
            }
        }while(linea!=null);
        bf.close();
    }
    
    public void jugar(){
        for(pregunta p : this.preguntas){
            this.puntuacion += p.preguntar();
        }
    }
    
    public int verPuntuacion(){
        return this.puntuacion;
    }
}
