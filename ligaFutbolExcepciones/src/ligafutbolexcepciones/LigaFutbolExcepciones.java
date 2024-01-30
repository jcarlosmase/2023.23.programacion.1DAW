/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ligafutbolexcepciones;

import ligafutbolexcepciones.excepciones.DorsalNegativo;

/**
 *
 * @author Juan C. Jiménez
 */
public class LigaFutbolExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            jugador j1 = new jugador(-2,"Lola Flores");
            
        }catch(DorsalNegativo dn){
            System.out.println("ERROR");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
