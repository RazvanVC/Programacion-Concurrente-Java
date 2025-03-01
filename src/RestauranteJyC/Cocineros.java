package RestauranteJyC;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class Cocineros extends Thread { // creación del hilo
    //atributos

    private String id_Cocinero;
    private final Mesa_platos mesa;
    private final JTextField texto;
    private boolean continuar;
    private final Log_Restaurante logTxt;

    public Cocineros(String id, Mesa_platos mesa, JTextField texto, Log_Restaurante logTxt) { //Constructor
        this.id_Cocinero = id;
        this.mesa = mesa;
        this.texto = texto;
        this.continuar = true;
        this.logTxt = logTxt;
    }

    public void run() {

        while (true) {
            if (continuar == true) { //comprueba si el atributo continuar está activo
                int tiempo = (int) (1500 + 500 * Math.random()); //generador del tiempo aleatorio
                Pedidos p;
                try {
                    
                    p = mesa.coger(); 

                    if (p == null) {
                        if (texto!=null) texto.setText("");{
                        System.out.print("");
                        continue;
                        } //comprueba si la mesa está vacia
                    }
                    texto.setText(this.id_Cocinero + " en la plancha " + p.getId() + " || "); // setea su texto
                    try { //escribe el log
                        logTxt.log.info("El cocinero "+id_Cocinero + "coje el plato de la mesa de platos del " + p.getId() + "y lo cocina");
                    } catch (Exception e) {}
                    
                    Thread.sleep(tiempo); //se duerme el tiempo determinado mientras cocina
                } catch (InterruptedException | SecurityException | IOException ex) {
                    Logger.getLogger(Cocineros.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                try {
                    Thread.sleep(100); //si el atributo continuar no está activo se duerme antes de volver a comprobarlo
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
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
}