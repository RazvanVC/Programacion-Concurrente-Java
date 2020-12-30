/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;


public class Cocineros extends Thread {
    private String id;
    //acceso al mostrador de pedidos
    
    private Mesa_platos mesa;
    
    public Cocineros(String id, Mesa_platos mesa){
    this.id=id;
    this.mesa=mesa;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public void run(){}
}
