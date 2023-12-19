/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciobaraja;

/**
 *
 * @author Juan C. Jiménez
 */
public class baraja {
    private carta [] mazo;
    private int numCartas;
    
    public baraja(){
        char [] palos = {'O','E','C','B'};
        int posicionMazo = 0;
       
        //instancia del array
        this.mazo = new carta[48];
        this.numCartas = 48;
        
        for (int i = 0; i < 4; i++) { //PALOS
            for (int j = 1; j <= 12; j++) { //NÚMEROS
                this.mazo[posicionMazo] = new carta(j,palos[i]);
                posicionMazo++;
            }
        }
        
    }
    
    public baraja(carta c){
        char [] palos = {'O','E','C','B'};
        int posicionMazo = 1;
        carta aux;
        
        //instancia del array
        this.mazo = new carta[48];
        this.numCartas = 48;
        
        this.mazo[0] = c;
        for (int i = 0; i < 4; i++) { //PALOS
            for (int j = 1; j <= 12; j++) { //NÚMEROS
                aux = new carta(j,palos[i]);
                if(!aux.esIgual(c)){
                    this.mazo[posicionMazo] = aux;
                    posicionMazo++;
                }
            }
        }
    }
    public void barajar(){
        int numIntercambios = Numeros.Aleatorio(50, 150);
        int pos1,pos2;
        carta aux;
        
        for (int i = 0; i < numIntercambios; i++) {
            pos1 = Numeros.Aleatorio(0, 47);
            pos2 = Numeros.Aleatorio(0, 47);
            aux = this.mazo[pos1];
            this.mazo[pos1] = this.mazo[pos2];
            this.mazo[pos2] = aux;
        }
    }
    
    public void cortar(int pos){
        carta [] trozo = new carta[pos+1];
        int indice = 0;
        
        //1er paso: muevo el primer bloque de cartas al array auxiliar
        for (int i = 0; i < pos+1; i++) {
            trozo[i] = this.mazo[i];
        }
        //2º paso: desplazo el bloque inferior hacia arriba
        for (int i = pos+1; i < 48; i++) {
            this.mazo[indice] = this.mazo[i];
            indice++;
        }
        //3er paso: muevo el bloque del array auxiliar a la parte de abajo del mazo
        indice = 48-(pos+1);
        for (int i = 0; i < pos+1; i++) {
            this.mazo[indice] = trozo[i];
            indice++;
        }
    }
    
    public carta robar(){
        carta c;
        int posicion=0;
        
        if(this.numCartas > 0){
            //busco la posición de la primera carta del mazo que no esté robada
            while(this.mazo[posicion].isRobada()){
                posicion++;
            }
            c = this.mazo[posicion];
            this.mazo[posicion].setRobada(true);
            this.numCartas--;
            return c;
        }
        return null;
    }
    
    public carta eligeCarta(){
        carta c;
        int posicion=Numeros.Aleatorio(0, 47);
        
        if(this.numCartas > 0){
            //busco la posición de la primera carta del mazo que no esté robada
            while(this.mazo[posicion].isRobada()){
                posicion=Numeros.Aleatorio(0, 47);
            }
            c = this.mazo[posicion];
            this.mazo[posicion].setRobada(true);
            this.numCartas--;
            return c;
        }
        return null;        
    }
    
        public void eligeCartas(carta [] cartas){
        carta c;
        int posicion=Numeros.Aleatorio(0, 47);
        int num = 0;

        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = null;
        }
        while(num !=cartas.length && this.numCartas > 0){
            //busco la posición de la primera carta del mazo que no esté robada
            while(this.mazo[posicion].isRobada()){
                posicion=Numeros.Aleatorio(0, 47);
            }
            cartas[num] = this.mazo[posicion];
            this.mazo[posicion].setRobada(true);
            this.numCartas--;
            num++;
        }
    }
        
    public void mostrar(int columnas){
        String resul = "";
        int nFilas = this.numCartas / columnas;
        
    }
    
    public String toString(){
        String resul = "";
        
        for (int i = 0; i < 48; i++) {
            if(!this.mazo[i].isRobada()){
                resul += this.mazo[i];
                resul += "\n";
            }
        }
        return resul;
    }
}
