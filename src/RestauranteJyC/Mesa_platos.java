package RestauranteJyC;

import java.util.ArrayList;

/**
 *
 * @author josep
 */
public class Mesa_platos {
    private int capacidad;
    private ArrayList<Pedidos> contador_p;
    private boolean lleno;
    private boolean vacio;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        int i;
        for(i=0;capacidad>i;i++){
            if (contador_p.get(i)== (new Pedidos ("vacio")) ){
                lleno=false;
                break;
            }
            else{lleno=true;}
            
        }
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public boolean isVacio() {
        int i;
        for(i=0;i<capacidad;i++){
            if(contador_p.get(i)!=(new Pedidos ("vacio"))){
                vacio=false;
                break;
            }
            else{vacio=true;}
        
        }
        
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }
    
    

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }

    public void setContador_p(int posicion,Pedidos almendra) {
        if (contador_p.get(posicion)==(new Pedidos ("vacio"))){
        this.contador_p.set(posicion, almendra);
        }
    }

    
    
    public Pedidos getPedidoMesa(int posicion) {
        Pedidos alpaca= contador_p.get(posicion);
        contador_p.set(posicion, (new Pedidos ("vacio")));
        return alpaca;
    }
    
    
    
    
}
