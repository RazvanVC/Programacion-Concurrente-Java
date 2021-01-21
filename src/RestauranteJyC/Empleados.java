/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Empleados extends Thread {

    private String id_Empleado;

    private Mostrador_pedidos mostrador;
    private Mesa_platos mesa;
    private JTextField texto;
    private boolean continuar;

    public Empleados(String id, Mostrador_pedidos mostrador, Mesa_platos mesa, JTextField texto) {
        this.id_Empleado = id;
        this.mostrador = mostrador;
        this.mesa = mesa;
        this.texto = texto;
        this.continuar = true;
    }

    public String getId_Empleado() {
        return id_Empleado;
    }

    public void setId(String id) {
        this.id_Empleado = id;
    }

    public void setContinuar(boolean a) {
        this.continuar = a;

    }

    public boolean getContinuar() {
        return this.continuar;
    }

    @Override
    public void run() {
        while (true) {
            //Tardan entre 300 y 700
            Pedidos p;
            if (continuar == true) {
                try {
                    int tiempo = (int) (300 + 400 * Math.random());
                    Thread.sleep(tiempo);

                    p = mostrador.coger();
                    texto.setText(id_Empleado + " llevando " + p.getId());

                    mesa.dejar(p);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }
}
