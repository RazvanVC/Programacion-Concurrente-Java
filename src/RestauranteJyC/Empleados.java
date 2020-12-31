/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.util.logging.Level;
import java.util.logging.Logger;

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
    
    public void moverPedido(int a, int b) throws InterruptedException{
        int capacidad_mos=mostrador.getCapacidad();
        int capacidad_mesa=mesa.getCapacidad();
        int tiempo=(int)(300+400*Math.random());
        Thread.sleep(tiempo);//esto hace que se tarde el tiempo de cada empleado
        Pedidos[] comanda= mesa.getContador_p();
        comanda[b]= seleccion(a);
        vaciar(a);
        mostrador.setCapacidad(capacidad_mos-1);
        mesa.setCapacidad(capacidad_mesa+1);
    }
    
    //para obtener un valor de mostrador
    public Pedidos seleccion(int a){
        Pedidos[] pedido= mostrador.getContador_p();
        return pedido[a];
    }
    
    //elimina el valor que se acaba de mover
    public void vaciar(int a){
        Pedidos[] pedido= mostrador.getContador_p();
        pedido[a]= null;
    }
    
    
    //este método desaparecerá
    public boolean esperarPedidoMesa(){ //con esto se comprueba si la mesa está llena
        int i;
        int c=0; //contador para saber los null
        Pedidos[] comanda=mesa.getContador_p();
        for (i=0; i<mesa.getLengthContador_p();i++){
            if (comanda[i]!=null){
            } else {    
                c=c+1;
            }
        }    
        if(c==mesa.getLengthContador_p()){
            return true;//hay que esperar a que se vacíe la mesa
        }
        else {return false;}
        
    }
    
    public boolean esperarPedidoMostrador(){//comprueba que el mostrador esté vacío
        int i;
        int c=0; //contador para saber los null
        Pedidos[] comanda=mostrador.getContador_p();
        for (i=0; i<mostrador.getLengthContador_p();i++){
            if (comanda[i]==null){
                c=c+1;    
            }
        }    
        if(c==mostrador.getLengthContador_p()){
            return true;//hay que esperar a que haya algo en la mesa
        }
        else {return false;}
    }
    
    public void run(){
    //Tardan entre 300 y 700
    int i;
    int j;
    
    for (i=0,j=0; i<mostrador.getLengthContador_p();i++,j++){ 
        try {
            if (i==mostrador.getLengthContador_p()){
                i=0;
            }
            if (j==mesa.getLengthContador_p()){
                j=0;
            }
            
            boolean continuar;
            continuar=false;
            if (!continuar){
            
                while(esperarPedidoMostrador()){
                    continuar=false;
                    Thread.holdsLock(continuar);
                }
            
                continuar=true;
            
                while(esperarPedidoMesa()){
                    continuar=false;
                    Thread.holdsLock(continuar);
                }
            
                continuar=true;
            }
            
            moverPedido(i,j);
            
        } catch (InterruptedException ex) {
            Logger.getLogger(Empleados.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        }
        
        
        
    }
}
