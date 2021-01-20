/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

/**
 *
 * @author Razvan Virgil y Daniel González
 */
public class Cliente extends Thread{
    
    //Atributos
    private String id_cliente;
    private Mostrador mostrador;
    
    //Constructor
    public Cliente(String id, Mostrador mostrador){
        super(String.valueOf(id));
        this.id_cliente=id;
        this.mostrador = mostrador;
    }
    
    @Override
    public void run(){
        
        mostrador.depositarPedido(this, this.id_cliente+"-P1");
        
        try {
            sleep(500+((int) (500*Math.random())));
        } catch (InterruptedException e){}
        
        mostrador.depositarPedido(this, this.id_cliente+"-P2");
    }
    
    //Getters
    public String getId_cliente() {
        return id_cliente;
    }

    //Setters
    public void setId_cliente(String id) {
        this.id_cliente = id;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Cliente"+ this.id_cliente;
    }
}
