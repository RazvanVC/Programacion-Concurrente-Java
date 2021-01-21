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
public class Empleado extends Thread {

    //Atributos
    private String id_empleado;
    private Mesa mesa;
    private Mostrador mostrador;
    private final JTextField estado;
    private boolean activo;

    //Constructor
    public Empleado(String id, Mesa mesa, Mostrador mostrador, JTextField estado) {
        this.id_empleado = id;
        this.mesa = mesa;
        this.mostrador = mostrador;
        this.estado = estado;
        this.activo = true;
    }

    //Getters
    public String getId_empleado() {
        return id_empleado;
    }

    //Setters
    public void setId_empleado(String id) {
        this.id_empleado = id;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public boolean isActivo() {
        return activo;
    }

    //Métodos
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run() {
        while (true) {
            System.out.print("");
            if (isActivo()) {
                Pedido pedidoLlevado;
                try {
                    pedidoLlevado = mostrador.recogerPedido();
                    if (pedidoLlevado == null) {
                        estado.setText("");
                        continue;
                    }
                    estado.setText(id_empleado + " llevando " + pedidoLlevado.getId_pedido() + " a la mesa de platos");
                    sleep((int) (300 + 400 * Math.random()));
                    mesa.dejarPedido(pedidoLlevado);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}