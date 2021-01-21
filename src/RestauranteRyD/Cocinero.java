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
    private String idCocinero;
    private Mesa mesaPlatos;
    private JTextField mesaCocina;
    private boolean estado;

    //Constructor
    public Cocinero(String id_cocinero, Mesa mesaPlatos, JTextField mesaCocina) {
        this.idCocinero = id_cocinero;
        this.mesaCocina = mesaCocina;
        this.mesaPlatos = mesaPlatos;
        this.estado = true;
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
                        mesaCocina.setText("");
                        continue;
                    }
                    mesaCocina.setText(this.idCocinero + " cocinando " + pedidoRecibido.getId_pedido() + "...");
                    sleep(1500 + (int) (500 * Math.random()));
                    //String plato = mesaPlatos.getPedido();
                    //mesaCocina.setText(idCocinero + "esta cocinando" + plato);

                } catch (InterruptedException e) { }
            }
        }

    }
}
