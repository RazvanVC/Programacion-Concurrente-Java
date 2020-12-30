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
    
}
