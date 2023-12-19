/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraybi;

/**
 *
 * @author Juan C. Jiménez
 */
public class ArrayBI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaración e instanciación
        int [][] array1 = new int[3][4];
        
        //Inicialización el array
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                //array1[i][j] = (int)(Math.random()*10);
                //array1[i][j] = i;
                //array1[i][j] = j;
                array1[i][j] = 2-i;
            }
        }
        //Mostramos los datos del array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(array1[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
    
}
