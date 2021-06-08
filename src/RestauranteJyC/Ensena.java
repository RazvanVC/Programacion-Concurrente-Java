package RestauranteJyC;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Ensena extends UnicastRemoteObject implements texto_mostrador {
    private final Interfaz_Restaurante interfaz;
    
    public Ensena() throws RemoteException, SecurityException, IOException {
        interfaz=new Interfaz_Restaurante();
    }
    
    @Override
    public String getTextoPedidos() throws RemoteException { //coge lo que hay en textoPedidos
        return interfaz.getTextoPedidos();
    }
    
    @Override   
    public String getTextoPlatos() throws RemoteException { //coge lo que hay en textoPedidos
        return interfaz.getTextoPlatos();
    }
}