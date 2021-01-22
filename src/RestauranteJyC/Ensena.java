/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Ensena extends UnicastRemoteObject implements texto_mostrador {
    private final Interfaz_Restaurante interfaz;
    

    public Ensena() throws RemoteException, SecurityException, IOException {
        interfaz=new Interfaz_Restaurante();
        interfaz.setVisible(true);
    }
@Override
    public String getTextoPedidos() throws RemoteException {
        return interfaz.getTextoPedidos();
        
    }
@Override   
    public String getTextoPlatos() throws RemoteException {
        return interfaz.getTextoPlatos();
        
    }

    
    
}
