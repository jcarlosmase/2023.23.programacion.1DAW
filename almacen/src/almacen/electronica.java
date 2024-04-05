/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacen;

/**
 *
 * @author Juan C. Jiménez
 */
enum categoria{
    ELECTRODOMESTICOS,
    INFORMATICA,
    TELEFONIA
}

public class electronica extends producto{
    private categoria cat;
    
    public electronica(String nombre, int stock, float Pcompra, float Pventa, categoria c){
        super(nombre,stock,Pcompra,Pventa);
        int cod = super.getNumProductos();
        super.setCodigo("EL"+(cod));
        /*if(cod < 10)
            super.setCodigo("EL00"+(cod));
        else if(cod < 100)
            super.setCodigo("EL0"+(cod));
        else
            super.setCodigo("EL"+(cod));*/
        this.cat = c;
    }

    public categoria getCat() {
        return cat;
    }

    public void setCat(categoria cat) {
        this.cat = cat;
    }
    
    @Override
    public String getLinea(){
        return super.getLinea() + ";" + this.getCat();
    }
    
}
