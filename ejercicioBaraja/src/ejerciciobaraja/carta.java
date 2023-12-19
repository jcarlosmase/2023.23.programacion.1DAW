/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobaraja;

/**
 *
 * @author Juan C. Jiménez
 */
public class carta {
    private int num;
    private char palo;
    private boolean robada;
    
    public carta(int n, char p){
        this.num = n;
        this.palo = p;
        this.robada = false;
    }

    public int getNum() {
        return num;
    }

    public char getPalo() {
        return palo;
    }

    public boolean isRobada() {
        return robada;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setPalo(char palo) {
        this.palo = palo;
    }

    public void setRobada(boolean robada) {
        this.robada = robada;
    }
    
    public boolean esIgual(carta c){
        if(this.num == c.getNum() && this.palo == c.getPalo())
            return true;
        return false;
    }

    public String toString() {
        String num = (this.num < 10?this.num + " ":""+this.num);
        
        return  "+-------+\n" +
                "| "+num+"    |\n" +
                "|       |\n" +
                "|   "+ this.palo +"   |\n" +
                "|       |\n" +
                "|    "+num+" |\n" +
                "+-------+";
    }
    
}
