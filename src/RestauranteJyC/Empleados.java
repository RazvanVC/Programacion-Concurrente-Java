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
public class Empleados extends Thread{
    private String id;
    
    private Mostrador_pedidos mostrador;
    private Mesa_platos mesa;
    
    public Empleados(String id, Mostrador_pedidos mostrador){
    this.id=id;
    this.mostrador=mostrador;}
    
    public Empleados(String id, Mesa_platos mesa){
    this.id = id;
    this.mesa = mesa;}

    public String getId() {
        return id;
    }

       public void setId(String id) {
        this.id = id;
    }
    
    
    public void run(){
    //Tardan entre 300 y 700
    int tiempo;
    int i;
    for (i=0; i<mostrador.getLengthContador_p();i++){
        
        }
    }
}
