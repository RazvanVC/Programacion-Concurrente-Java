/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author razvanvc
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Controlador obj = new Controlador();
            Registry registry = LocateRegistry.createRegistry(1099);
            Naming.rebind("//127.0.0.1/Controlador", obj);
            System.out.println("El servidor ha quedado registrado");
        } catch (MalformedURLException | RemoteException e){
            System.out.println("ERROR");
        }
    }
    
}
