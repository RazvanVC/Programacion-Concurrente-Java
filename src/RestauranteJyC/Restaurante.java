/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

/**
 *
 * @author razva
 */
public class Restaurante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clientes cliente = new Clientes();
        Thread c1= new Thread(cliente); 
        cliente.start();
        
        Empleados empleado = new Empleados();
        Thread c2= new Thread(cliente);
        empleado.start();
    
        Cocineros cocinero = new Cocineros();
        Thread c3= new Thread(cliente);
        cocinero.start();
    }
    
}
