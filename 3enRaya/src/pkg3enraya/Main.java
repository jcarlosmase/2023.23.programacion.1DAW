/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3enraya;

/**
 *
 * @author Juan C. Jiménez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][] tablero = new char[3][3];
        boolean j1=false, j2=false; 
        //int aleatorio;
        
        //Inicializo el tablero aleatoriamente
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //aleatorio = (int)(Math.random()*2);
                //if(aleatorio==0){
                //    tablero[i][j] = 'O';
                //}else if(aleatorio==1){
                //    tablero[i][j] = 'X';
                //}
                tablero[i][j] = (int)(Math.random()*2)==0?'O':'X';
            }
        }
        //Muestro el tablero
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j]+" ");
            }
            System.out.print("\n");
        }
        //Busco 3 en raya: O-> Jugador 1
        //                 X-> Jugador 2
        //Buscar por filas
        for (int i = 0; i < 3; i++) {
            //Fila 0
            if((tablero[i][0]==tablero[i][1]) && (tablero[i][0]==tablero[i][2])){
                if(tablero[i][0]=='O'){ //Hay tres en raya de jugador 1
                    j1=true;
                }else{ //Hay tres en raya de jugador 2
                    j2=true;
                }
            }
        }
        //Buscar por columnas
        for (int i = 0; i < 3; i++) {
            if((tablero[0][i]==tablero[1][i]) && (tablero[0][i]==tablero[2][i])){
                if(tablero[0][i]=='O'){ //Hay tres en raya de jugador 1
                    j1=true;
                }else{ //Hay tres en raya de jugador 2
                    j2=true;
                }
            }
        }
        //Busco las diagonales
        if(tablero[0][0]==tablero[1][1] && tablero[0][0]==tablero[2][2]){//Hay 3 en raya en la primera diagonal
            if(tablero[0][0]=='O'){ //Hay tres en raya de jugador 1
                j1=true;
            }else{ //Hay tres en raya de jugador 2
                j2=true;
            }
        }
        if(tablero[0][2]==tablero[1][1] && tablero[0][2]==tablero[2][0]){//Hay 3 en raya en la segunda diagonal
            if(tablero[0][2]=='O'){ //Hay tres en raya de jugador 1
                j1=true;
            }else{ //Hay tres en raya de jugador 2
                j2=true;
            }
        }
        //Muestro los mensajes
        if(j1==true && j2==true){
            System.out.println("EMPATE");
        }else{
            if(j1==true){
                System.out.println("El jugador 1 tiene tres en raya");
            }
            if(j2==true){
                System.out.println("El jugador 2 tiene tres en raya");
            }
        }
    }
}
