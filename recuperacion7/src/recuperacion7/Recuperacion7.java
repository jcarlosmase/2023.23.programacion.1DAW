/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recuperacion7;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Juan C. Jiménez
 */
public class Recuperacion7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,vehiculo> garage = new HashMap<String,vehiculo>();
        
        garage.put("1111AAA", new vehiculo("Seat","Ibiza",100,1200.23f));
        garage.put("1111ABB", new vehiculo("Seat","Leon",12100,1325.23f));
        garage.put("2222BBB", new vehiculo("Renault","Clio",97123,875.45f));
        garage.put("3333ABC", new vehiculo("Seat","Altea",40578,1975.78f));
        garage.put("4444DDD", new vehiculo("Citroen","C4",210,789.45f));
        
        //1.- ¿Cuántos vehículos hay en el garage?
        System.out.println("Hay " + garage.size() + " vehículo/s");
        
        //2.- ¿Existe algún vehículo con matrícula 5555EEE?
        if(garage.containsKey("5555EEE"))
            System.out.println("Si existe el vehículo 5555EEE");
        else
            System.out.println("No existe el vehículo 5555EEE");
        
        //3.- ¿Cuantos vehículos tienen matrículas con la letra 'A'?
        int contador = 0;
        for(Map.Entry datos : garage.entrySet()){
            if(datos.getKey().toString().contains("A"))
                contador++;
        }
        System.out.println("Hay " + contador + " vehículos con una 'A' en su matrícula");
        
        //4.- Muestra todos los datos de los vehículos de la marca "Seat"
        for(Map.Entry datos : garage.entrySet()){
            vehiculo coche = (vehiculo) datos.getValue();
            if(coche.getMarca().equals("Seat"))
                System.out.println(datos.getValue());
        }
        
        //5.- Muestra todos los datos del vehículo de la marca Seat con menos kilómetros.
        String matricula = "";
        int km = 0;
        for(Map.Entry datos : garage.entrySet()){
            vehiculo coche = (vehiculo) datos.getValue();
            if(coche.getMarca().equals("Seat")){
                if(km == 0){
                    matricula = datos.getKey().toString();
                    km = coche.getKms();
                }else{
                    if(coche.getKms() < km){
                        matricula = datos.getKey().toString();
                        km = coche.getKms();                        
                    }
                }
            }
        }
        if(matricula == ""){
            System.out.println("No hay ningún Seat en el garage");
        }else{
            System.out.println("El Seat con menos Kms es:");
            System.out.println(garage.get(matricula));
        }
    }
}
