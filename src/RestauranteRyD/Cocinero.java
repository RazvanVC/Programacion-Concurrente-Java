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
public class Cocinero extends Thread{
    
    //Atributos
    private long id_cocinero;
    
    //Constructor
    public Cocinero(long id_cocinero){
        this.id_cocinero=id_cocinero;
    }
    
    //Getters
    public long getId_cocinero() {
        return id_cocinero;
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
    public void setId_cocinero(long id_cocinero) {
        this.id_cocinero = id_cocinero;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Cocinero"+ this.id_cocinero;
    }
}
