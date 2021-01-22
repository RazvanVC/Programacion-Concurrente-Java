/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.util.ArrayList;
import javax.swing.JTextArea;

/**
 *
 * @author razvanvc
 */

public class ListaHilos {
    private final ArrayList<Pedido> lista;
    private final JTextArea tf;
    
    public ListaHilos (JTextArea tf, int capacidad){
        lista = new ArrayList<>(capacidad);
        this.tf = tf;
    }
    
    public synchronized void insertarPedido(Pedido p){
        
        lista.add(p);
        imprimir();
    }
    
    public synchronized Pedido eliminarPedido(){
        Pedido p;
        p = lista.get(0);
        lista.remove(0);
        imprimir();
        return p;
    }
    
    private void imprimir(){
        String text = "";
        for (int i = 0; i<lista.size(); i++){
            text = text+ (i+1) + ". " + lista.get(i).getId_pedido()+"\n";
        }
        this.tf.setText(text);
    }

    public ArrayList<Pedido> getLista() {
        return lista;
    }
}
