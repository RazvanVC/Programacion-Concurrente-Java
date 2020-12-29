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
    private long id_empleado;
    
    //Constructor
    public Empleado(long id){
        this.id_empleado=id;
    }
    
    //Getters
    public long getId_empleado() {
        return id_empleado;
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
    public void setId_empleado(long id) {
        this.id_empleado = id;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Empleado"+ this.id_empleado;
    }
}
