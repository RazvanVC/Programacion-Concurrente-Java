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
public class Pedido extends Thread{
    
    //Atributos
    private long id_pedido;
    
    //Constructor
    public Pedido(long id){
        this.id_pedido=id;
    }
    
    //Getters
    public long getId_pedido() {
        return id_pedido;
    }

    public static int getMIN_PRIORITY() {
        return MIN_PRIORITY;
    }

    public static int getNORM_PRIORITY() {
        return NORM_PRIORITY;
    }

    public static int getMAX_PRIORITY() {
        return MAX_PRIORITY;
    }

    //Setters
    public void setId_pedido(long id) {
        this.id_pedido = id;
    }
    
    //Métodos
    public String toString() {
        return "Pedido"+ this.id_pedido;
    }
}
