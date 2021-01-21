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
    int capacidad;
    ListaHilos pedidosMostrador;
    Semaphore semaforo;
    boolean lleno;
    JTextArea escritura;
    
    //Constructor
    public Mostrador(int capacidad, boolean lleno, JTextArea mostrador) {
        this.capacidad = capacidad;
        this.pedidosMostrador = new ListaHilos(mostrador, capacidad);
        semaforo=new Semaphore(capacidad, true);
        this.lleno = lleno;
        this.escritura = mostrador;
    }
    
    //Getters
    public int getCapacidad() {
        return capacidad;
    }

    public ListaHilos getContador_pedidos() {
        return pedidosMostrador;
    }

    public boolean isLleno() {
        return lleno;
    }
    
    //Setters
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setContador_pedidos(ListaHilos contador_pedidos) {
        this.pedidosMostrador = contador_pedidos;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
    //Métodos

    public void depositarPedido(Pedido p) {
        try {
            semaforo.acquire();
            pedidosMostrador.insertarPedido(p);
        } catch (InterruptedException e){ }
    }
    
    public Pedido recogerPedido(){
        try {
            semaforo.release();
            pedidosMostrador.eliminarPedido();
        } catch (Exception e){
            
        }
        
        
        return null;
    }
}