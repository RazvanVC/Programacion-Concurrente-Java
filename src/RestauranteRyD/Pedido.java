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
public class Pedido {
    
    //Atributos
    private String id_pedido;
    
    //Constructor
    public Pedido(String id){
        this.id_pedido=id;
    }
    
    //Getters
    public String getId_pedido() {
        return id_pedido;
    }

    //Setters
    public void setId_pedido(String id) {
        this.id_pedido = id;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Pedido"+ this.id_pedido;
    }
}
