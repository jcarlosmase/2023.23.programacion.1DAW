/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen;

/**
 *
 * @author Juan C. Jiménez
 */
public class Almacen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        categoria cat = null;
            
        producto [] estanteria = new producto[100];
        electronica [] e1 = new electronica[100];
        estanteria[0] = new electronica("Batidora",100,12f,15f,cat.INFORMATICA);
        System.out.println(estanteria[0].getLinea());
        
        /*
        categoria cat = null;
        String cosa = "INFORMATICA";
        switch(cosa){
            case "ELECTRODOMESTICOS":
                electronica el0 = new electronica("Batidora",100,12f,15f,cat.ELECTRODOMESTICOS);
            case "TELEFONIA":
                electronica el0 = new electronica("Batidora",100,12f,15f,cat.TELEFONIA);
            case "INFORMATICA":
                electronica el0 = new electronica("Batidora",100,12f,15f,cat.INFORMATICA);
        }
        electronica el0 = new electronica("Batidora",100,12f,15f,cosa);
        electronica el1 = new electronica("Batidora",100,12f,15f,cat.ELECTRODOMESTICOS);
        electronica el2 = new electronica("raton",100,5f,10f,cat.INFORMATICA);
        
        System.out.println(el1);
        System.out.println(el2);
*/
    }
    
}
