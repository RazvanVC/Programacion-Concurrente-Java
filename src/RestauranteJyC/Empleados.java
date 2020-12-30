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
    public boolean compruebaMesas(){
        if (mesa.isLleno()){
            return false;}
        else{ return true;}
    }
    public boolean compruebaMostrador(){ 
    /*metodo que comprueba si el mostrador de pedidos
      está vacío, de ser así, trabajar será false, y 
      los empleados finalizarán su ejecución*/
        boolean trabajar;
        if (mostrador.getContador_p()==null){
            trabajar=false;
        }
        else{trabajar=true;}
        return trabajar;
    }
    
    public void moverPedido(int a, int b){
        int capacidad_mos=mostrador.getCapacidad();
        int capacidad_mesa=mesa.getCapacidad();
        mesa.setContador_p(b)= mostrador.getContador_p(a);
    }
    
    
    public void run(){
    //Tardan entre 300 y 700
    int tiempo;
    int i;
    for (i=0; i<mostrador.getLengthContador_p();i++){ 
        if (i==10){
            i=0;}
        tiempo=(int)(300+400*Math.random());
        
        
        
        }
        
        
        
        }
    }
}
