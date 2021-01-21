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
public class Empleado extends Thread{
    
    //Atributos
    private String id_empleado;
    private Mesa mesa;
    private Mostrador mostrador;
    
    //Constructor
    public Empleado(String id, Mesa mesa, Mostrador mostrador){
        this.id_empleado=id;
        this.mesa = mesa;
        this.mostrador = mostrador;
    }
    
    //Getters
    public String getId_empleado() {
        return id_empleado;
    }

    //Setters
    public void setId_empleado(String id) {
        this.id_empleado = id;
    }
    
    //Métodos
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run(){
        while (true){
            try {
                mostrador.recogerPedido();
                sleep((int) (300+400*Math.random()));
            } catch (InterruptedException e) {}
        }
    }
}
