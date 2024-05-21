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
public class preguntaVF extends pregunta{
    
    private String enunciado;
    private boolean respCorrecta;

    public preguntaVF(String enunciado, boolean respCorrecta) {
        super("[VF]");
        this.enunciado = enunciado;
        this.respCorrecta = respCorrecta;
    }

    @Override
    public int preguntar() {
        Scanner sc = new Scanner(System.in);
        String respUsu;
        
        System.out.println("ENUNCIADO: " + this.enunciado);
        System.out.println("\n");
        System.out.println("Responde V/F: ");
        respUsu = sc.nextLine();
        if(this.respCorrecta && respUsu.equals("V"))
            return 1;
        if(!this.respCorrecta && respUsu.equals("F"))
            return 1;
        return 0;
    }
    
}
