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
        Clientes cliente = new Clientes("1", mp);
        Thread c1= new Thread(cliente); 
        cliente.start();
        
        Empleados empleado = new Empleados("1", mp);
        Thread c2= new Thread(cliente);
        empleado.start();
    
        Cocineros cocinero = new Cocineros("1", mep);
        Thread c3= new Thread(cliente);
        cocinero.start();
        
        //capacidad Mostrador es de 10
        //capacidad Mesa_platos es de 20
        //2 empleados
        //3 cocineros
        
    }
    
}
