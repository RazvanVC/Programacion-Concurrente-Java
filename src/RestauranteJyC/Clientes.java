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
public class Clientes extends Thread{
    private String id;
    private final Mostrador_pedidos mostrador;
    
    public Clientes(String id, Mostrador_pedidos mostrador){
    this.id=id;
    this.mostrador=mostrador;}
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void run(){
        //tarda entre 500 y 1000
        //dejan 2 pedidos
        
        int tiempo;
        int i;
        for(i=0;i<2;i++){
        tiempo=(int)(500+500*Math.random());
        int capacidad=mostrador.getCapacidad();
        boolean sigue=esperar_pedido();
        
        if (sigue){
            try {
                Thread.sleep(tiempo);
                mostrador.setCapacidad(capacidad+1);
                mostrador.insert(new Pedidos("cliente"+id+1));
            } catch (InterruptedException ex) {
                Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        else{
            Thread.holdsLock(sigue);
            }
        
        }
    }
    
    public boolean esperar_pedido(){
        
        return false;}

    
       
}
 