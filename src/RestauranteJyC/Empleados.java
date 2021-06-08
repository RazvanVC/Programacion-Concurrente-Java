package RestauranteJyC;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class Empleados extends Thread { 
    //Atributos
    private String id_Empleado;
    private Mostrador_pedidos mostrador;
    private Mesa_platos mesa;
    private JTextField texto;
    private boolean continuar;
    private Log_Restaurante logTxt;

    public Empleados(String id, Mostrador_pedidos mostrador, Mesa_platos mesa, JTextField texto, Log_Restaurante logTxt) { //Constructor
        this.id_Empleado = id;
        this.mostrador = mostrador;
        this.mesa = mesa;
        this.texto = texto;
        this.continuar = true;
        this.logTxt = logTxt;
    }
    
    @Override
    public void run() {
        while (true) { //bucle de función
            //Tardan entre 300 y 700
            Pedidos p;

            if (continuar == true) { //si continuar está activo
                try {
                    int tiempo = (int) (300 + 400 * Math.random()); //genera el tiempo
                    

                    p = mostrador.coger(); //coge un pedido
                    if (p == null) { //Cuando coge un null, se bloquea, y no inicia
                        if (texto!=null) texto.setText("");{
                        System.out.print("");
                        continue;
                        } //comprueba si la mesa está vacia

                        
                    }
                    texto.setText(id_Empleado + " llevando " + p.getId()); //imprime en el texto en la aplicacion
                    try {
                        logTxt.log.info(id_Empleado + "coje el pedido del mostrador del cliente"+ p.getId()+" en la mesa del platos" ); //hace el log
                    } catch (Exception e) {

                    }
                    Thread.sleep(tiempo); //se duerme
                    mesa.dejar(p); //deja un pedido
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                try {
                    Thread.sleep(100); //si no está activo se duerme y después vuelve a comprobarlo
                } catch (InterruptedException ex) {
                    Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
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
}