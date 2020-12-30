package RestauranteJyC;

/**
 *
 * @author josep
 */
public class Mesa_platos {
    int capacidad;
    Pedidos contador_p[];
    boolean lleno;

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public Pedidos[] getContador_p() {
        return contador_p;
    }

    public void setContador_p(Pedidos[] contador_p) {
        this.contador_p = contador_p;
    }

    int getLengthContador_p() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
