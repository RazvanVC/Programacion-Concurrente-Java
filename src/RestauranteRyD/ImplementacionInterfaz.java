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
public class ImplementacionInterfaz extends UnicastRemoteObject implements InterfazRemota{

    private final int numeroPedidos = 2;
    private final int TAMANNO_MOSTRADOR = 10;
    private final int MAX_TAMANNO_MESA = 20;
    private final String RUTA_ESCRITURA = "./evolucionRestauranteRMI.txt";
    
    
    public ImplementacionInterfaz() throws RemoteException {}
    
    @Override
    public void empezarPrograma(JTextArea ta_Mostrador, JTextArea ta_Mesa) throws RemoteException {
        
        LogRestaurante lr = new LogRestaurante(RUTA_ESCRITURA);
        Mostrador mp = new Mostrador(TAMANNO_MOSTRADOR, ta_Mostrador);
        Mesa mesaPlatos = new Mesa(MAX_TAMANNO_MESA, ta_Mesa);
        //Creamos e iniciamos los 200 clientes
        //SUGERENCIA: Exportar todo esto a un metodo mas abajo
        for (int i = 1; i<201; i++){
            Cliente cv = new Cliente("Cliente"+i, mp, numeroPedidos, lr);
            cv.start();
        }
        Empleado e2 = new Empleado("Empleado 2", mesaPlatos, mp, lr);
        Empleado e1 = new Empleado("Empleado 1", mesaPlatos, mp, lr);
        
        e1.start();
        e2.start();
        
    }
    
}
