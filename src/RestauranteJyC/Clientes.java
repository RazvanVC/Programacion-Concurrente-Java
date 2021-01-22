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
public class Clientes extends Thread { //Creación de la clase con los atributos

    private String id_Cliente;
    private final Mostrador_pedidos mostrador;
    private boolean continuar;

    public Clientes(String id, Mostrador_pedidos mostrador) { // setea los atributos
        this.id_Cliente = id;
        this.mostrador = mostrador;
        this.continuar = true;
    }

    public void run() {
        //tarda entre 500 y 1000
        //dejan 2 pedidos

        int tiempo;
        int i;
        for (i = 0; i < 2; i++) { //bucle para dejar pedidos
            tiempo = (int) (500 + 500 * Math.random()); //genera el tiempo aleatorio
            try {
                Thread.sleep(tiempo); //duerme el tiempo aleatorio

                mostrador.insert(new Pedidos("cliente" + id_Cliente + "-P" + i + ". ")); //añade al mostrador el pedido 
                try { //inserta en el log
                    Log_Restaurante logTxt = new Log_Restaurante("log.txt");

                    logTxt.log.setLevel(Level.INFO);
                    logTxt.log.info(id_Cliente + "deja el pedido en el mostrador"); //mensaje en el log
                } catch (Exception e) {

                }

            } catch (InterruptedException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }
    //metodos get y set del id
    public String getIdCliente() {
        return id_Cliente;
    }

    public void setId(String id) {
        this.id_Cliente = id;
    }


}
