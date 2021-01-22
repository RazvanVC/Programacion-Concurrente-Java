/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextArea;

/**
 *
 * @author razvanvc
 */
public class Controlador extends UnicastRemoteObject implements InterfazComun{

    public Controlador() throws RemoteException {}
    @Override
    public void empezarPrograma() throws RemoteException {
        Monitor m = new Monitor();
        m.setVisible(true);
    }
    
}
