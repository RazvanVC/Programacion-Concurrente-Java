/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.rmi.Naming;

/**
 *
 * @author josep
 */
public class Comienzo {
    public static void main(String[] args){
        try{
          texto_mostrador obj = (texto_mostrador) Naming.lookup("//127.0.0.1/Controlador");
            obj.iniciar();
            System.out.println("Iniciando Monitor..");  
            
        }catch (Exception e) {
        }
    
    
    }
    
}
