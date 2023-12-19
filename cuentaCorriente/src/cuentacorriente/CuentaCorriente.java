/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentacorriente;

/**
 *
 * @author Juan C. Jiménez
 */
public class CuentaCorriente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Instancia de la clase cuenta: objeto cuenta1
        cuenta cuenta1 = new cuenta("Pepillo de los palotes","1111111111111111111",0.5,1000);
        cuenta cuenta2 = new cuenta("Juan Imedio","22222222222222222222",0.1,1500);
        cuenta cuenta3 = new cuenta();
        cuenta cuenta4 = new cuenta(cuenta1);
        cuenta cuenta5;
        
        
        System.out.println(cuenta3.getSaldo());
        
        if(cuenta1.transferencia(200, cuenta2)){
            System.out.println("La transferencia se ha realizado correctamente");
        }else{
            System.out.println("ERROR. No se ha podido realizar la transferencia");
        }
        System.out.println("Saldo de la cuenta 1: " + cuenta1.getSaldo());
        System.out.println("Saldo de la cuenta 2: " + cuenta2.getSaldo());
           
        
        System.out.println(cuenta1.getCliente());
        cuenta1.setCliente("Lola Flores");
        System.out.println(cuenta1.getCliente());
        System.out.println("El saldo de la cuenta de "+cuenta2.getCliente()+ " es " + cuenta2.getSaldo() + "€");
        
        if(cuenta1.reintegro(2000)){
            System.out.println("Se ha podido hacer el reintegro correctamente. Su saldo es: " + cuenta1.getSaldo() + "€");
        }else{
            System.out.println("ERROR. No se ha podido hacer el reintegro. Su saldo es: " + cuenta1.getSaldo() + "€");
        }
        
        if(cuenta1.ingreso(-220)){
            System.out.println("El ingreso se ha hecho correctamente. Tu saldo es " + cuenta1.getSaldo());
        }else{
            System.out.println("ERROR: No se ha podido hacer el ingreso. Tu saldo es " + cuenta1.getSaldo());
        }
        cuenta5 = new cuenta(cuenta1);
            
    }
}
