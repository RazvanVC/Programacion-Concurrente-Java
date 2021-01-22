/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author josep
 */
public class Servidor{

    public static void main(String[] args)    {
        try{
            Ensena obj = new Ensena();
            
            Registry registry = LocateRegistry.createRegistry(1099); 
            Naming.rebind("//127.0.0.1/texto_mostrador", (Remote) obj);   
            System.out.println("El servidor ha quedado registrado");
        }

        catch (MalformedURLException | RemoteException e){
            System.out.println("ERROR");
        }
    }
    
}
