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
    private long id_cliente;
    
    //Constructor
    public Cliente(long id){
        this.id_cliente=id;
    }
    
    //Getters
    public long getId_cliente() {
        return id_cliente;
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
    public void setId_cliente(long id) {
        this.id_cliente = id;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Cliente"+ this.id_cliente;
    }
}
