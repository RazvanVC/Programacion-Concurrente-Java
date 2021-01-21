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

public class Cocineros extends Thread {

    private String id_Cocinero;
    //acceso al mostrador de pedidos

    private final Mesa_platos mesa;
    private final JTextField texto;
    private boolean continuar;

    public Cocineros(String id, Mesa_platos mesa, JTextField texto) {
        this.id_Cocinero = id;
        this.mesa = mesa;
        this.texto = texto;
        this.continuar = true;
    }

    public boolean getContinuar() {
        return this.continuar;
    }

    public void setContinuar(boolean a) {
        this.continuar = a;

    }

    public String getIdCocinero() {
        return id_Cocinero;
    }

    public void setId(String id) {
        this.id_Cocinero = id;
    }

    public void run() {

        while (true) {
            if (continuar == true) {
                int tiempo = (int) (1500 + 500 * Math.random());
                Pedidos p;
                try {
                    Thread.sleep(tiempo);
                    p = mesa.coger();
                    if (p == null) {
                        texto.setText("vacio");

                        continue;
                    }
                    texto.setText(this.id_Cocinero + " en la plancha " + p.getId() + " || ");

                } catch (InterruptedException ex) {
                    Logger.getLogger(Cocineros.class.getName()).log(Level.SEVERE, null, ex);
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