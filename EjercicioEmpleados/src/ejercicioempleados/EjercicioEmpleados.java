/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioempleados;

import java.util.ArrayList;

/**
 *
 * @author Juan C. Jiménez
 */
public class EjercicioEmpleados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<empleado> plantilla  = new ArrayList<empleado>();
        porHoras e1 = new porHoras(10,15,"22222222B","Ana","López");
        e1.setNumHoras(50);
        porComision e2 = new porComision(10,"22222222B","Ana","López");
        e2.setVentas(10000);
        asalariadoPorComision e3 = new asalariadoPorComision(100,10,"22222222B","Ana","López");
        e3.setVentas(20000);
        e3.recompensa(10);
      
        plantilla.add(new asalariado(250,"11111111A","Pepe","Palotes"));
        plantilla.add(e1);
        plantilla.add(e2);
        plantilla.add(e3);
        
        //Vamos a pagar
        for(empleado e : plantilla){
            System.out.println(e + "\nSUELDO: " + e.salario());
        }
        
    }
    
}
