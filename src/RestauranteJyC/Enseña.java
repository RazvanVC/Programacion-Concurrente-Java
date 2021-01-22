/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Enseña extends UnicastRemoteObject implements texto_mostrador {

    private Empleados empleado1;
    private Empleados empleado2;
    private Clientes serie[] = new Clientes[200];
    private Cocineros cocinero1;
    private Cocineros cocinero2;
    private Cocineros cocinero3;

    public Enseña() throws RemoteException {
    }

    @Override
    public void iniciar(JTextField mostrador, JTextField mesa) throws RemoteException {

        Mostrador_pedidos mp = new Mostrador_pedidos(10, false, mostrador);
        Mesa_platos mep = new Mesa_platos(20, false, mesa);
        int i;

        for (i = 0; i < 200; i++) {
            String id = String.valueOf(i);
            Clientes cliente = new Clientes(id, mp);
            serie[i] = cliente;
            Thread ci = new Thread(serie[i]);
            ci.start();
            System.out.println("se crean clientessss yujuuu");
        }
        //declaracion empleado
        empleado1 = new Empleados("empleado_1", mp, mep, null);
        empleado2 = new Empleados("empleado_2", mp, mep, null);
        //declaración cocineros
        cocinero1 = new Cocineros("cocinero_1", mep, null);
        cocinero2 = new Cocineros("cocinero_2", mep, null);
        cocinero3 = new Cocineros("cocinero_3", mep, null);
        //      Iniciadores
        //empleados
        Thread empleado1 = new Thread();
        Thread empleado2 = new Thread();

        Thread cocinero1 = new Thread();
        Thread cocinero2 = new Thread();
        Thread cocinero3 = new Thread();

        empleado1.start();
        empleado2.start();
        //cocineros

        cocinero1.start();
        cocinero2.start();
        cocinero3.start();

    }
}
