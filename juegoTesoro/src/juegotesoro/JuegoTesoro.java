/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegotesoro;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class JuegoTesoro {

    /**
     * @param args the command line arguments
     */
    //Procedimiento que rellena del caracter 'L' un array de 6x10
    public static void rellenaELES(char [][] t){
        int i,j;
        
        for (i = 0; i < 6; i++) {
            for (j = 0; j < 10; j++) {
                t[i][j]='L';
            }
        }
    }
    
    //Generar número aleatorios
    public static int Aleatorio(int desde, int hasta){
        return (int)(Math.random()*(hasta-desde+1)+desde);
    }
    
    //Colocar bomba y tesoro
    public static void colocaBT(char [][] tab){
        int tesoroX,tesoroY;
        int bombaX,bombaY;
        
        //Coloco la bomba
        bombaX=Aleatorio(0,5);  //Genero un nº aleatorio entre 0 y 5
        bombaY=Aleatorio(0,9); //Genero un nº aleatorio entre 0 y 9
        tab[bombaX][bombaY] = '*';  //Coloco la bomba en el tablero
        
        //Coloco el tesoro
        do{
            tesoroX=Aleatorio(0,5);  //Genero un nº aleatorio entre 0 y 5
            tesoroY=Aleatorio(0,9); //Genero un nº aleatorio entre 0 y 9
        }while(bombaX==tesoroX && bombaY==tesoroY);
        tab[tesoroX][tesoroY] = 'T';  //Coloco el tesoro en el tablero
    }
    
    //Buscar la coordenada X de la bomba dentro del tablero
    public static int buscabombaX(char [][] t){
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                if(t[i][j]=='*'){
                    return i;
                }
            }
        }
        return -1; //No hay ninguna bomba en el tablero
    }
    
    //Mostrar el tablero en pantalla
    public static void mostrarTablero(char [][] ta, boolean ocultar){
            //Muestro el tablero
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 10; j++) {
                    if(!ocultar){//Muestra la bomba y el tesoro
                        System.out.print(ta[i][j]+" ");
                    }else{ //No muestra el tesoro y la bomba
                        if(ta[i][j]!='D'){
                            System.out.print("L ");
                        }else{
                            System.out.print("D ");
                        }
                    }
                }
                System.out.print("\n");
            }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        char[][] tablero = new char[6][10];
        boolean finJuego=false;
        int disparos=3; //Numero máximo de disparos
        Scanner sc = new Scanner(System.in);
        int disparoX,disparoY;
        
        //Llamo al procedimiento
        rellenaELES(tablero);
        //Llamo al procedimiento 
        colocaBT(tablero);
        //Llamada a la función
        //bombaX=buscabombaX(tablero);
        
        //EMPIEZA EL JUEGO
        do{
            //Llamada al procedimiento
            mostrarTablero(tablero,true);
            
            System.out.println("Numero de balas: " + disparos);
            System.out.println("Dime la coordenada X:");
            disparoX=sc.nextInt();
            System.out.println("Dime la coordenada Y:");
            disparoY=sc.nextInt();
            //compruebo lo que hay en el tablero para la posición de disparo
            if(tablero[disparoX][disparoY]=='T'){ //CASO 1: Has encontrado el tesoro
                System.out.println("FELICIDADES!!!!! Has encontrado el tesoro");
                finJuego=true;
            }else if(tablero[disparoX][disparoY]=='*'){ //CASO 2: Has encontrado la bomba
                System.out.println("OOOOOOOOHHHH!!!!! Has perdido. Inténtalo otra vez con otra partida");
                finJuego=true;
            }else if(tablero[disparoX][disparoY]=='D'){ //CASO 3: La celda ya ha sido disparada
                System.out.println("Esa celda ya ha sido disparada. Prueba con otra");
            }else{ //CASO 4: He disparado a una celda libre
                tablero[disparoX][disparoY]='D'; //Marco la casilla como disparada
                disparos--; //Resto una bala
                if(disparos==0){
                    System.out.println("OOOOOOOOHHHH!!!!! Has perdido. Inténtalo otra vez con otra partida");
                    finJuego=true;
                }else{
                    //Dar las pistas
                }
            }
        }while(!finJuego);
        mostrarTablero(tablero,false);
    }// FIN DEL MAIN
}
