/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ligafutbolexcepciones;
import ligafutbolexcepciones.excepciones.DorsalNegativo;

/**
 *
 * @author Juan C. Jiménez
 */
public class jugador {
    private int dorsal;
    private String nombreYapellidos;
    private int[] golesXpartido;
    
    public jugador(int d, String nya) throws DorsalNegativo{
        if(d<0)
            throw new DorsalNegativo();
        this.dorsal = d;
        this.nombreYapellidos = nya;
        this.golesXpartido = new int[38]; //suponemos que en la liga se juegan 38 partidos
        for (int i = 0; i < 38; i++) {
            this.golesXpartido[i] = -1;   //Significa que ese partido no ha sido jugado todavía
        }
    }
}
