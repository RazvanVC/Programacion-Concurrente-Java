/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

/**
 *
 * @author josep
 */
public class Restaurante {

    
    public static void main(String[] args) {
        Mostrador_pedidos mp = new Mostrador_pedidos();
        Mesa_platos mep = new Mesa_platos();
        Clientes serie[]=new Clientes[200];
        
        for (int i=0;i<200;i++){
            String id=String.valueOf(i);
            Clientes cliente=new Clientes(id,mp);
            serie[i]=cliente;
            Thread c1= new Thread(serie[i]); 
            c1.start();
            
            
        }
                    
        //Clientes cliente =new Clientes("1",mp); 
        //Empleados empleado = new Empleados("1", mp, mep);
        //Thread c2= new Thread(empleado);
        
        //empleado.start();
        //cliente.start();
    
        //Cocineros cocinero = new Cocineros("1", mep);
        //Thread c3= new Thread(cliente);
        //cocinero.start();
        
        //capacidad Mostrador es de 10-
        //capacidad Mesa_platos es de 20-
        //2 empleados
        //3 cocineros
        
    }
    
}
