/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author razvanvc
 */

public class ListaHilos {
    private final ArrayList<Pedido> lista;
    private final JTextField tf;
    
    public ListaHilos (JTextField tf){
        lista = new ArrayList<>();
        this.tf = tf;
    }
    
    public synchronized void insertarPedido(Pedido p){
        lista.add(p);
        imprimir();
    }
    
    public synchronized void eliminarPedido(Pedido p){
        lista.remove(p);
        imprimir();
    }
    
    private void imprimir(){
        String text = "";
        for (int i = 0; i<lista.size(); i++){
            text = text+lista.get(i).getId_pedido();
        }
        this.tf.setText(text);
    }
}
