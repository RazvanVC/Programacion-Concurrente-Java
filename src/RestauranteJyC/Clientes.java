/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josep
 */
public class Clientes extends Thread {

    private String id_Cliente;
    private final Mostrador_pedidos mostrador;
    private boolean continuar;

    public Clientes(String id, Mostrador_pedidos mostrador) {
        this.id_Cliente = id;
        this.mostrador = mostrador;
        this.continuar = true;
    }

    public void run() {
        //tarda entre 500 y 1000
        //dejan 2 pedidos

        int tiempo;
        int i;
        for (i = 0; i < 2; i++) {
            tiempo = (int) (500 + 500 * Math.random());
            try {
                Thread.sleep(tiempo);
                
                mostrador.insert(new Pedidos("cliente" + id_Cliente+"-P" + i+". "));

            } catch (InterruptedException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    
    public String getIdCliente() {
        return id_Cliente;
    }

    public void setId(String id) {
        this.id_Cliente = id;
    }

    public boolean Continuar() {
        return continuar;
    }

    public void Continuar(boolean y) {
        this.continuar = y;
    }

    
}
