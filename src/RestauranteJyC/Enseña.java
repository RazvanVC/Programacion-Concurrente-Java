/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Enseña extends UnicastRemoteObject implements texto_mostrador {
    private final Interfaz_Restaurante interfaz;
    

    public Enseña() throws RemoteException {
        interfaz=new Interfaz_Restaurante();
    }

    public String getTextoPedidos() throws RemoteException {
        return interfaz.getTextoPedidos();
        
    }
    public String getTextoPlatos() throws RemoteException {
        return interfaz.getTextoPlatos();
        
    }

    
    
}
