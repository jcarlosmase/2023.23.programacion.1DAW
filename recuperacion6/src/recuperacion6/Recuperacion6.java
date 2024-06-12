/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion6;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<producto> almacen = new ArrayList<producto>();
        
        almacen.add(new producto("Chicles","alimentacion",0.05f,100));
        almacen.add(new producto("Tomates","alimentacion",1.15f,50));
        almacen.add(new producto("Pan","alimentacion",0.80f,10));
        almacen.add(new producto("Alicates","ferreteria",10f,2));
        almacen.add(new producto("Manteles","hogar",5.25f,0));
        almacen.add(new producto("Jarra plástico","hogar",2.15f,10));
        almacen.add(new producto("Cinta aislante","ferreteria",1.10f,0));
        almacen.add(new producto("Chuletón","alimentacion",10.10f,0));
        
        //0. Ordena la lista de productos por los siguientes criterios:
        //    - Primero por familias alfabéticamente
        //    - Segundo por nombre de producto alfabéticamente
        //    - Tercero por precio (primero los mas caros)
        //    - Cuarto por stock (de menor a mayor)
        Collections.sort(almacen);
        
        //1. Mostrar el contenido del almacen en pantalla con un foreach
        System.out.println("Ordena la lista de productos");
        for(producto p:almacen)
            System.out.println(p);
        System.out.println();
        
        //2. Borrar todos los productos de alimentación
        almacen.removeIf(p -> p.getFamilia().equals("alimentacion"));
        
        //3. Mostrar el contenido del almacen en pantalla con un foreach
        System.out.println("Borrar todos los productos de alimentación");
        for(producto p:almacen)
            System.out.println(p);
        System.out.println();
        
        //4. Borrar todos los productos de ferretería cuyo precio sea mayor de 5€
        almacen.removeIf(p -> p.getFamilia().equals("ferreteria") && p.getPrecio() > 5);
        
        //5. Mostrar el contenido del almacen en pantalla con un foreach
        System.out.println("Borrar todos los productos de ferretería cuyo precio sea mayor de 5€");
        for(producto p:almacen)
            System.out.println(p);
        System.out.println();
        
        //6. Eliminar todos los productos de hogar y de ferretería con stock 0
        almacen.removeIf(p -> (p.getFamilia().equals("hogar") && p.getStock() == 0) ||
                              (p.getFamilia().equals("ferreteria") && p.getStock() == 0));
        
        //7. Mostrar el contenido del almacen en pantalla con un foreach
        System.out.println("Eliminar todos los productos de hogar y de ferretería con stock 0");
        for(producto p:almacen)
            System.out.println(p);
        System.out.println();
    }
    
}
