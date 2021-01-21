/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.util.concurrent.Semaphore;
import javax.swing.JTextArea;

/**
 *
 * @author Razvan Virgil y Daniel González
 */
public class Mesa {
    
    //Atributos
    private final ListaHilos pedidosMesa;
    private final Semaphore semaforo;
    
    //Constructor
    public Mesa(int capacidad, JTextArea mesaCocina) {
        this.pedidosMesa = new ListaHilos(mesaCocina, capacidad);
        semaforo = new Semaphore(capacidad, true);
    }
    

    
    //Métodos
    void dejarPedido(Pedido pedidoLlevado) {
        try {
            semaforo.acquire();
            pedidosMesa.insertarPedido(pedidoLlevado);
        } catch (InterruptedException e){ }
    }
    
    public Pedido recogerPedido(){
        Pedido p = null;
        try {
            p = pedidosMesa.eliminarPedido();
            semaforo.release();
        } catch (Exception e){ }
        return p;
    }
}
