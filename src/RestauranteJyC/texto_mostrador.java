/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author josep
 */
public interface texto_mostrador extends Remote{
    //public texto_mostrador() throws RemoteException{}
    public void mostrador() throws RemoteException;    
}

public class texto_mostrador extends UnicastRemoteObject implements texto_mostrador {
        
    public texto_mostrador() throws RemoteException {
        }                 //Constructor

        /*public String saludar(String nombre) throws RemoteException { // Implementación del método remoto
            return "Buenos días " + nombre;
        }*/
    }
