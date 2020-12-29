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
public class Mostrador {
    
    //Atributos
    int capacidad;
    Pedido[] contador_pedidos;
    boolean lleno;
    
    //Constructor
    public Mostrador(int capacidad, Pedido[] contador_platos, boolean lleno) {
        this.capacidad = capacidad;
        this.contador_pedidos = contador_platos;
        this.lleno = lleno;
    }
    
    //Getters
    public int getCapacidad() {
        return capacidad;
    }

    public Pedido[] getContador_pedidos() {
        return contador_pedidos;
    }

    public boolean isLleno() {
        return lleno;
    }
    
    //Setters
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setContador_pedidos(Pedido[] contador_pedidos) {
        this.contador_pedidos = contador_pedidos;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }
    
    //Métodos
    @Override
    public String toString() {
        return "Mesa ("+ this.capacidad + "," + this.contador_pedidos + "," + this.lleno + ")";
    }
}