/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3t;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class preguntaPistas extends pregunta{

    private String[] pistas;
    private String respCorrecta;

    public preguntaPistas(String[] pistas, String respCorrecta) {
        super("[pistas]");
        this.pistas = pistas;
        this.respCorrecta = respCorrecta;
    }
    
    @Override
    public int preguntar() {
        Scanner sc = new Scanner(System.in);
        String respUsu;
        int i = 0;
        
        do {
            System.out.println("PISTA " + (i+1) + ": " + this.pistas[i]);
            System.out.println("Escribe la respuesta: ");
            respUsu = sc.nextLine();
            if(this.respCorrecta.toLowerCase().equals(respUsu.toLowerCase()))
                return this.pistas.length - i;
            else
                System.out.println("INCORRECTO");
            i++;
        }while(i<this.pistas.length);
        return 0;
    }
    
}
