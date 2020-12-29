/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;
import java.util.Random;

/**
 *
 * @author josep
 */
public class Clientes extends Thread{
    private long id;
    private Mostrador_pedidos mostrador;
    
    public Clientes(long id, Mostrador_pedidos mostrador){
    this.id=id;
    this.mostrador=mostrador;}
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public void run(){
        //tarda entre 500 y 1000
        //dejan 2 pedidos
        int tiempo;
        tiempo=(int)(500+500*Math.random());
        int capacidad=mostrador.getCapacidad();
        boolean sigue=esperar_pedido();
        if (sigue){
            mostrador.setCapacidad(capacidad+1);
            mostrador.insert(new Pedidos("cliente"+id+1));
            
        }
        else{
            //Wait;
            }
        
        }
    
    public boolean esperar_pedido(){
        
        return false;}

    
    
}
 