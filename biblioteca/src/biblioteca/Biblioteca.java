/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

/**
 *
 * @author Juan C. Jiménez
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        libro libro1 = new libro("123456", "La Ruta Prohibida", 2007);
        libro libro2 = new libro("112233", "Los Otros", 2016);
        libro libro3 = new libro("456789", "La rosa del mundo", 1995);
        revista revista1 = new revista("444555", "Año Cero", 2019, 344);
        revista revista2 = new revista("002244", "National Geographic", 2003, 255);
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(revista1);
        System.out.println(revista2);
        libro2.presta();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro2.presta();
        libro2.devuelve();
        if (libro2.estaPrestado()) {
            System.out.println("El libro está prestado");
        }
        libro3.presta();
        System.out.println(libro2);
        System.out.println(libro3);
        
        prestable p = new libro("778899", "La buena suerte", 2017);
        System.out.println(p);
    }
}
