
package RestauranteJyC;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Clientes extends Thread { //Creación de la clase con los atributos

    private String id_Cliente;
    private final Mostrador_pedidos mostrador;
    private Log_Restaurante logTxt;
   

    public Clientes(String id, Mostrador_pedidos mostrador, Log_Restaurante logTxt) { // contructor
        this.id_Cliente = id;
        this.mostrador = mostrador;
        this.logTxt = logTxt;
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
