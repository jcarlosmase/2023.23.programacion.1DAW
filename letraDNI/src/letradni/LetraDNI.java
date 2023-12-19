/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package letradni;

import java.util.Scanner;

/**
 *
 * @author Juan C. Jiménez
 */
public class LetraDNI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int dni,resto;
        
        System.out.println("Dime tu DNI (sin la letra)");
        dni = sc.nextInt();
        resto = dni%23;
        switch(resto){
            case 0:
                System.out.println(dni+"-T");
                break;
            case 1:
                System.out.println(dni+"-R");
                break;
            case 2:
                System.out.println(dni+"-W");
                break;
            case 3:
                System.out.println(dni+"-A");
                break;
            case 4:
                System.out.println(dni+"-G");
                break;
            case 5:
                System.out.println(dni+"-M");
                break;
            case 6:
                System.out.println(dni+"-Y");
                break;
            case 7:
                System.out.println(dni+"-F");
                break;
            case 8:
                System.out.println(dni+"-P");
                break;
            case 9:
                System.out.println(dni+"-D");
                break;
            case 10:
                System.out.println(dni+"-X");
                break;
            case 11:
                System.out.println(dni+"-B");
                break;
            case 12:
                System.out.println(dni+"-N");
                break;
            case 13:
                System.out.println(dni+"-J");
                break;
            case 14:
                System.out.println(dni+"-Z");
                break;
            case 15:
                System.out.println(dni+"-S");
                break;
            case 16:
                System.out.println(dni+"-Q");
                break;
            case 17:
                System.out.println(dni+"-V");
                break;
            case 18:
                System.out.println(dni+"-H");
                break;
            case 19:
                System.out.println(dni+"-L");
                break;
            case 20:
                System.out.println(dni+"-C");
                break;
            case 21:
                System.out.println(dni+"-K");
                break;
            case 22:
                System.out.println(dni+"-E");
                break;
        }
        
    }
    
}
