package RestauranteJyC;

import java.io.IOException;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor{

    public static void main(String[] args) throws SecurityException, IOException    {
        try{
            Ensena obj = new Ensena();
            
            Registry registry = LocateRegistry.createRegistry(1099); 
            Naming.rebind("//127.0.0.1/texto_mostrador", (Remote) obj);   //registra el servidor
            System.out.println("El servidor ha quedado registrado");    //mensaje para comprobar el registro del servidor
        }
        catch (MalformedURLException | RemoteException e){
            System.out.println("ERROR");
        }
    }
}