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

    public Pedidos[] getContador_p() {
        return contador_p;
    }
    public int getLengthContador_p(){
        return contador_p.length;}


    public void setContador_p(Pedidos[] contador_p) {
        this.contador_p = contador_p;
    }
 }   

