package RestauranteJyC;

/**
 *
 * @author josep
 */
public class Mostrador_pedidos {
    private int capacidad;
    private boolean lleno;
    private Pedidos contador_p[];

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
