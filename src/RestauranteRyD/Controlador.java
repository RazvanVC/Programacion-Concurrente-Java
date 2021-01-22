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
    public void empezarPrograma(JTextArea a, JTextArea b) throws RemoteException {
        System.out.print(a.getText());
        LogRestaurante lr = new LogRestaurante("./evolucionRestauranteRMI.txt");
        Mostrador mp = new Mostrador(10, a);
        Mesa mesaPlatos = new Mesa(20, b);
        //Creamos e iniciamos los 200 clientes
        //SUGERENCIA: Exportar todo esto a un metodo mas abajo
        for (int i = 1; i<201; i++){
            Cliente cv = new Cliente("Cliente"+i, mp, 2, lr);
            cv.start();
        }
        
        Empleado e1 = new Empleado("Empleado 1", mesaPlatos, mp, null, lr);
        e1.start();
        Empleado e2 = new Empleado("Empleado 2", mesaPlatos, mp, null, lr);
        e2.start();
        
        Cocinero c1 = new Cocinero("Cocinero 1", mesaPlatos, null, lr);
        Cocinero c2 = new Cocinero("Cocinero 2", mesaPlatos, null, lr);
        Cocinero c3 = new Cocinero("Cocinero 3", mesaPlatos, null, lr);
        
        c1.start();
        c2.start();
        c3.start();
    }
    
}
