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
    private int numPedidos;
    private final LogRestaurante log;
    
    //Constructor
    public Cliente(String id, Mostrador mostrador, int numPedidos, LogRestaurante log){
        super(String.valueOf(id));
        this.id_cliente=id;
        this.mostrador = mostrador;
        this.numPedidos = numPedidos;
        this.log = log;
    }
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run(){
        int i = 0;
        while (i<numPedidos){
            try {
                mostrador.depositarPedido(new Pedido(this.id_cliente+"-P"+(i+1)));
                sleep(500+((int) (500*Math.random())));
                log.escribirLog(this.id_cliente + " ha depositado el pedido: " + this.id_cliente+"-P"+(i+1));
                //Insertar clase log
            } catch (InterruptedException e){}
            i++;
        }
    }
    
    //Getters
    public String getId_cliente() {
        return id_cliente;
    }
    
    public Mostrador getMostrador() {
        return mostrador;
    }    

    public int getNumPedidos() {
        return numPedidos;
    }

    //Setters
    public void setId_cliente(String id) {
        this.id_cliente = id;
    }
    
    public void setMostrador(Mostrador mostrador) {
        this.mostrador = mostrador;
    }
    
    public void setNumPedidos(int numPedidos) {
        this.numPedidos = numPedidos;
    }
}
