package RestauranteJyC;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface texto_mostrador extends Remote{
       public String getTextoPedidos() throws RemoteException; //conexiones entre clientres y servidores
       public String getTextoPlatos() throws RemoteException;
}


