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
public class preguntaTest extends pregunta{
    private String enunciado;
    private String[] respuestas;
    private int respCorrecta;

    public preguntaTest(String enunciado, String[] respuestas, int respCorrecta) {
        super("[Test]");
        this.enunciado = enunciado;
        this.respuestas = respuestas;
        this.respCorrecta = respCorrecta;
    }
    
    @Override
    public int preguntar() {
        Scanner sc = new Scanner(System.in);
        int respUsu;
        
        System.out.println("ENUNCIADO: " + this.enunciado);
        System.out.println("\n");
        for (int i = 0; i < 4; i++) {
            System.out.println(i + ". " + this.respuestas[i]);
        }
        System.out.println("\n");
        System.out.println("Elige una opcion: ");
        respUsu = sc.nextInt();
        if(this.respCorrecta == respUsu)
            return 1;
        return 0;
    }
    
    
    
}
