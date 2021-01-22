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
public class Mostrador {
    
    //Atributos
    private final ListaHilos pedidosMostrador;
    private final Semaphore semaforo;
    
    /**
     * Contructor generico de mostrador
     * @param capacidad indica la capacidad de la que dispone el mostrador para insertar los pedidos
     * @param mostrador indica el sitio de la interfaz que se corresponde al mostrador
     */
    public Mostrador(int capacidad, JTextArea mostrador) {
        this.pedidosMostrador = new ListaHilos(mostrador, capacidad);
        semaforo=new Semaphore(capacidad);
    }
    
    //Métodos
    /**
     * Coge su sitio en el semaforo y inserta el pedido en el ArrayList de hilos
     * @param pedidoRecibido 
     */
    public void depositarPedido(Pedido pedidoRecibido) {
        try {
            semaforo.acquire();
            pedidosMostrador.insertarPedido(pedidoRecibido);
        } catch (InterruptedException e){ }
    }
    
    public Pedido recogerPedido(){
        Pedido p = null;
        try {
            p = pedidosMostrador.eliminarPedido();
            semaforo.release();
        } catch (Exception e){ }
        return p;
    }
}