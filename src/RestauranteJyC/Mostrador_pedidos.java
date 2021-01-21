package RestauranteJyC;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Mostrador_pedidos {
    private int capacidad;
    private boolean lleno;
    private ArrayList<Pedidos> contador_p;
    private Semaphore poli;
    private JTextField Texto;
    
    public Mostrador_pedidos(int capacidad, boolean lleno,JTextField Text){
        this.capacidad=capacidad;
        this.lleno=lleno;
        poli = new Semaphore (capacidad, true);
        this.contador_p=contador_p;
        this.Texto=Text;
        contador_p=new ArrayList<> (capacidad);
        
        
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

    

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }


    public void setContador_p(Pedidos contador_p, int posicion) {
        this.contador_p.set(posicion, contador_p);
    }

    void insert(Pedidos pedidos) {
        try {
            poli.acquire();
            contador_p.add(pedidos);
            String  text="4";
            for (int i=0; i<contador_p.size();i++){
                
                text = text+(i+1)+"| "+contador_p.get(i).getId();
                
            }
            Texto.setText(text);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
            
        
    }
    
    public Pedidos getPedidoMostrador(int posicion) {
        Pedidos alpaca= contador_p.get(posicion);
        contador_p.get(posicion);
        return alpaca;
    }
 }   

