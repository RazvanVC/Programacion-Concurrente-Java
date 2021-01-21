/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author razvanvc
 */
public class ControlRestaurante {
    
    private final Lock lock;
    private Condition condicionParada;
    private boolean stopSystem;
    private boolean stopEmpleado1;
    private boolean stopEmpleado2;
    //Log registroSistema
    
    
    public ControlRestaurante(/*Log registroSistema*/){
        lock = new ReentrantLock();
        condicionParada = lock.newCondition();
        stopSystem = false;
        stopEmpleado1 = false;
        stopEmpleado2 = false;
    }
    
    public void watchState(String id){
        try {
            lock.lock();
            while (stopSystem){
                condicionParada.await();
            }
            while( (id.equals("Empleado1")&&stopEmpleado1) || (id.equals("Empleado2") && stopEmpleado2) ){
                condicionParada.await();
            }
        } catch (InterruptedException e){ /* Se puede incluir en las entradas del sistema los errores */ 
        } finally { lock.unlock(); } 
    }
}
