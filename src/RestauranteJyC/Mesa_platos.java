package RestauranteJyC;

/**
 *
 * @author josep
 */
public class Mesa_platos {
    private int capacidad;
    private Pedidos contador_p[];
    private boolean lleno;
    private boolean vacio;

    public int getCapacidad() {
        capacidad=contador_p.length;
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        int i;
        for(i=0;contador_p.length>i;i++){
            if (contador_p[i]==null){
                lleno=false;
                break;
            }
            else{lleno=true;}
            
        }
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public boolean isVacio() {
        int i;
        for(i=0;i<contador_p.length;i++){
            if(contador_p[i]!=null){
                vacio=false;
                break;
            }
            else{vacio=true;}
        
        }
        
        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }
    
    

    public Pedidos[] getContador_p() {
        return contador_p;
    }

    public void setContador_p(int posicion,Pedidos almendra) {
        if (contador_p[posicion]==null){
        this.contador_p[posicion] = almendra;
        }
    }

    int getLengthContador_p() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Pedidos getPedidoMesa(int posicion) {
        Pedidos alpaca= contador_p[posicion];
        contador_p[posicion]=null;
        return alpaca;
    }
    
    
    
    
}
