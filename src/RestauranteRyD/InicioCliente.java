/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author razvanvc
 */
public class InicioCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            InterfazComun obj = (InterfazComun) Naming.lookup("//127.0.0.1/Controlador");
            obj.empezarPrograma();
            System.out.println("Iniciando Monitor..");
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
        }

    }

}
