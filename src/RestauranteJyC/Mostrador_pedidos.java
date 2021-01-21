package RestauranteJyC;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Mostrador_pedidos {
    private int capacidad;
    private boolean lleno;
    private ArrayList<Pedidos> contador_p;

    Mostrador_pedidos(JTextField TextoPedidos) {
        
        for (int i=0;i<capacidad;i++){
            TextoPedidos.setText((String) (contador_p.get(i)).getId());
            
            
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
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }


    public void setContador_p(Pedidos contador_p, int a) {
        this.contador_p.set(a, contador_p);
    }

    void insert(Pedidos pedidos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Pedidos getPedidoMostrador(int posicion) {
        Pedidos alpaca= contador_p.get(posicion);
        contador_p.get(posicion);
        return alpaca;
    }
 }   

