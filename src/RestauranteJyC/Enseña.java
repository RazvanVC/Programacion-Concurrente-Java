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

    

    public Enseña() throws RemoteException {
    }
@Override
    public void iniciar() throws RemoteException {
        Modulo_Visualizacion k= new Modulo_Visualizacion();
        k.setVisible(true);
    }
}
