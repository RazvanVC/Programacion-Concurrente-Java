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
public class Mesa {
    
    //Atributos
    int capacidad;
    Pedido contador_platos[];
    boolean lleno;
    
    //Constructor
    public Mesa(int capacidad) {
        this.capacidad = capacidad;
        this.lleno = false;
    }
    
    //Getters
    public int getCapacidad() {
        return capacidad;
    }

    public Pedido[] getContador_platos() {
        return contador_platos;
    }

    public boolean isLleno() {
        return lleno;
    }
    
    //Setters
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setContador_platos(Pedido[] contador_platos) {
        this.contador_platos = contador_platos;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Mesa ("+ this.capacidad + "," + this.contador_platos + "," + this.lleno + ")";
    }

    void dejarPedido(Pedido pedidoLlevado) {
        
    }
}
