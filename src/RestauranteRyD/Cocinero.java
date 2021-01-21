/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import javax.swing.JTextField;

/**
 *
 * @author Razvan Virgil y Daniel González
 */
public class Cocinero extends Thread{
    
    //Atributos
    private String idCocinero;
    private Mesa mesaPlatos;
    private JTextField mesaCocina;
    
    //Constructor
    public Cocinero(String id_cocinero, Mesa mesaPlatos, JTextField mesaCocina){
        this.idCocinero=id_cocinero;
        this.mesaCocina = mesaCocina;
        this.mesaPlatos = mesaPlatos;
    }
    
    //Getters
    public String getId_cocinero() {
        return idCocinero;
    }

    //Setters
    public void setId_cocinero(String id_cocinero) {
        this.idCocinero = id_cocinero;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Cocinero"+ this.idCocinero;
    }
    
    @Override
    @SuppressWarnings("SleepWhileInLoop")
    public void run(){
        while (true){
            try {
            //String plato = mesaPlatos.getPedido();
            //mesaCocina.setText(idCocinero + "esta cocinando" + plato);
            sleep(1500+(int) (500*Math.random()));
            } catch (InterruptedException e) {
        
            }
        }
        
        
    }
}
