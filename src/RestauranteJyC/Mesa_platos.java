package RestauranteJyC;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Mesa_platos {
    private int capacidad;
    private ArrayList<Pedidos> contador_p;
    private boolean lleno;
    private boolean vacio;

    Mesa_platos(JTextField TextoPlatos) {
        for (int i=0;i<capacidad;i++){
            TextoPlatos.setText((String) (contador_p.get(i)).getId());
            
            
            if (i==capacidad){
        i=0;}
        
        }
    }

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
        
        this.contador_p.set(posicion, almendra);
        
    }

    
    
    public Pedidos getPedidoMesa(int posicion) {
        Pedidos alpaca= contador_p.get(posicion);
        contador_p.get(posicion);
        return alpaca;
    }
    
    
    
    
}
