/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;


public class Cocineros extends Thread {
    private String id_Cocinero;
    //acceso al mostrador de pedidos
    
    private final Mesa_platos mesa;
    private final JTextField texto;
    
    public Cocineros(String id, Mesa_platos mesa, JTextField text){
    this.id_Cocinero=id;
    this.mesa=mesa;
    this.texto=text;}

    public String getIdCocinero() {
        return id_Cocinero;
    }

    

    public void setId(String id) {
        this.id_Cocinero = id;
    }
    
    public void vaciar(int a){
        Pedidos[] pedido= mesa.getContador_p();
        pedido[a]= null;
    }
    
    public boolean esperarPedidoMesa(){//comprueba que la mesa esté vacía
        int i;
        int c=0; //contador para saber los null
        Pedidos[] comanda=mesa.getContador_p();
        for (i=0; i<mesa.getCapacidad();i++){
            if (comanda[i]==null){
                c=c+1;    
            }
        }    
        if(c==mesa.getCapacidad()){
            return true;//hay que esperar a que haya algo en la mesa
        }
        else {return false;}
    }
    
    public void cocinar(int a) throws InterruptedException{
        int capacidad=mesa.getCapacidad();
        //en preparar un pedido cada cocinero tarda entre 1500 y 2000 ms
        int tiempo=(int)(1500+500*Math.random());
        Pedidos[] comanda=mesa.getContador_p();
        
        Thread.sleep(tiempo);
        texto.setText(comanda[a].getId());
        comanda[a]=null;
        mesa.setCapacidad(capacidad-1);  
    }
    
    public void run(){
        boolean continuar;
        int i;
        for(i=0;i<mesa.getCapacidad();i++){
            try {
                if (i==mesa.getCapacidad()){
                    i=0;
                }
                continuar=false;
                while(esperarPedidoMesa()){
                    Thread.holdsLock(esperarPedidoMesa());
                }
                cocinar(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Cocineros.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
    }
}
