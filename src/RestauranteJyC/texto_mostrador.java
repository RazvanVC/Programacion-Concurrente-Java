/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public interface texto_mostrador extends Remote{
    //public texto_mostrador() throws RemoteException{}
    public void iniciar(JTextField mostrador, JTextField mesa) throws RemoteException;    
}


