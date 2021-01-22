/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import javax.swing.JTextField;

/**
 *
 * @author Razvan Virgil y Daniel González
 */
public class Cocinero extends Thread {

    //Atributos
    private final String idCocinero;
    private final Mesa mesaPlatos;
    private final JTextField mesaCocina;
    private boolean estado;
    private final LogRestaurante log;
    
    public Cocinero(String id_cocinero, Mesa mesaPlatos, JTextField mesaCocina, LogRestaurante log) {
        this.idCocinero = id_cocinero;
        this.mesaCocina = mesaCocina;
        this.mesaPlatos = mesaPlatos;
        this.estado = true;
        this.log = log;
    }

    Cocinero(String cocinero_1, Mesa mesaPlatos, LogRestaurante lr) {
        this.idCocinero = cocinero_1;
        this.mesaCocina = null;
        this.mesaPlatos = mesaPlatos;
        this.estado = true;
        this.log = lr;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Métodos
    @Override
    public String toString() {
        return "Cocinero" + this.idCocinero;
    }

    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        while (true) {
            System.out.print("");
            if (isEstado()) {
                Pedido pedidoRecibido;
                
                try {
                    pedidoRecibido = mesaPlatos.recogerPedido();
                    
                    if (pedidoRecibido == null) {
                        if(mesaCocina != null) mesaCocina.setText("");
                        System.out.println("");
                        continue;
                    }
                    log.escribirLog(idCocinero + " ha recogido de la mesa de platos el pedido: " + pedidoRecibido.getId_pedido());
                    if (mesaCocina != null) mesaCocina.setText(this.idCocinero + " cocinando " + pedidoRecibido.getId_pedido() + "...");
                    sleep(1500 + (int) (500 * Math.random()));
                    log.escribirLog(idCocinero + " ha acabado de cocinar el pedido: " + pedidoRecibido.getId_pedido());
                } catch (InterruptedException e) { }
            }
        }

    }
}
