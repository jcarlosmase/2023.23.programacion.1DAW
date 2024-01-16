/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestisimal;

/**
 *
 * @author Juan C. Jiménez
 */
public class almacen {
    private static final int maxArticulos = 100; //Tamaño del array estantería
    private articulo [] estanteria;
    private int numArticulos;
    
    //constructores
    public almacen(){
        //construir un almacen vacío;
        this.estanteria = new articulo[maxArticulos];
        for (int i = 0; i < maxArticulos; i++) {
            this.estanteria[i] = null;
        }
        this.numArticulos = 0;
    }
    
    public boolean alta(articulo a){
        if(this.numArticulos < maxArticulos){
            for (int i = 0; i < maxArticulos; i++) {
                if(this.estanteria[i]==null){
                    this.estanteria[i] = a;
                    this.numArticulos++;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean baja(String cod){
        for (int i = 0; i < maxArticulos; i++) {
            if(this.estanteria[i] != null){
                if(this.estanteria[i].getCodigo().equals(cod)){
                    this.estanteria[i] = null;
                    this.numArticulos--;
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean modificacion(String cod, articulo a){
         for (int i = 0; i < maxArticulos; i++) {
            if(this.estanteria[i] != null){
                if(this.estanteria[i].getCodigo().equals(cod)){
                    this.estanteria[i] = a;
                    return true;
                }
            }
        }
        return false;       
    }
    
    public void entrada(String cod, int cant) {
        for (int i = 0; i < maxArticulos; i++) {
            if(this.estanteria[i] != null){
                if (this.estanteria[i].getCodigo().equals(cod)) {
                    this.estanteria[i].setStock(estanteria[i].getStock() + cant);
                }
            }
        }
    }
    
    public boolean salida(String cod, int cant){
        for (int i = 0; i < maxArticulos; i++) {
            if(this.estanteria[i] != null){
                if (this.estanteria[i].getCodigo().equals(cod)) {
                    if(this.estanteria[i].getStock() >= cant){
                        this.estanteria[i].setStock(estanteria[i].getStock() - cant);
                        return true;
                    }
                    return false; //No hay stock
                }
            }
        }
        return false; //No existe ese artículo
    }
    
    public articulo buscar(String cod){
        for (int i = 0; i < maxArticulos; i++) {
            if(this.estanteria[i] != null){
                if (this.estanteria[i].getCodigo().equals(cod)) {
                        return this.estanteria[i];
                }
            }
        }
        return null; //No existe ese artículo        
    }
    
    public String toString(){
        String lista = "";
        
        if(this.numArticulos > 0){
            lista="CÓDIGO\tDESCRIPCIÓN\tPrecio\tPVP\tSTOCK\n";
            lista+="------------------------------------------------------\n";
            for (int i = 0; i < maxArticulos; i++) {
                if(this.estanteria[i]!=null){
                    lista+=this.estanteria[i] + "\n";
                }
            }
        }else{
            lista = "El almacén está vacío";
        }
        return lista;
    }
}
