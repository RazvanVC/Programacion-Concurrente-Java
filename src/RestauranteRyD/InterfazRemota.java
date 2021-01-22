/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.rmi.Remote;
import java.rmi.RemoteException;
import javax.swing.JTextArea;

/**
 *
 * @author razvanvc
 */
public interface InterfazRemota extends Remote{
    void empezarPrograma(JTextArea ta_Mostrador, JTextArea ta_Mesa) throws RemoteException;
}
