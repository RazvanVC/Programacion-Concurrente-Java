/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import javax.swing.JTextField;

/**
 *
 * @author Razvan Virgil y Daniel González
 */
public class Mostrador {
    
    //Atributos
    int capacidad;
    ListaHilos contador_pedidos;
    Semaphore semaforo;
    boolean lleno;
    JTextField escritura;
    
    //Constructor
    public Mostrador(int capacidad, boolean lleno, JTextField mostrador) {
        this.capacidad = capacidad;
        this.contador_pedidos = new ListaHilos(mostrador);
        semaforo=new Semaphore(capacidad,true);
        this.lleno = lleno;
        this.escritura = mostrador;
    }
    
    //Getters
    public int getCapacidad() {
        return capacidad;
    }

    public ListaHilos getContador_pedidos() {
        return contador_pedidos;
    }

    public boolean isLleno() {
        return lleno;
    }
    
    //Setters
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setContador_pedidos(ListaHilos contador_pedidos) {
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

    void depositarPedido(String string) {
        
        String texto = this.escritura.getText();
        this.escritura.setText(texto+string+";");
    }
}