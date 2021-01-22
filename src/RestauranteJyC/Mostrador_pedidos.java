package RestauranteJyC;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Mostrador_pedidos {

    private int capacidad;
    private boolean lleno;
    private ArrayList<Pedidos> contador_p;
    private Semaphore poli;
    private Semaphore uno;
    private Semaphore critico;
    private JTextField Texto;

    public Mostrador_pedidos(int capacidad, boolean lleno, JTextField Text) {
        this.capacidad = capacidad;
        System.out.println(this.capacidad+"--capacidad");
        this.lleno = lleno;
        poli = new Semaphore(capacidad, true);
        critico = new Semaphore(1);
        uno = new Semaphore(0);
        this.contador_p = contador_p;
        this.Texto = Text;
        contador_p = new ArrayList<>(capacidad);

    }
    
    public synchronized Pedidos coger() throws InterruptedException {
        uno.acquire();

        critico.acquire();
        System.out.println("Mostrador--" + contador_p.size());
        Pedidos pedido;

        pedido = contador_p.get(0);
        poli.release();
        critico.release();
        contador_p.remove(pedido);
        return pedido;
    }

    void insert(Pedidos pedidos) {
        try {
            poli.acquire();
            critico.acquire();
            contador_p.add(pedidos);
            String text = "";
            for (int i = 0; i < contador_p.size(); i++) {

                text = text +"| " + contador_p.get(i).getId();

            }
            Texto.setText(text);
            critico.release();
            uno.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        return lleno;
    }

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }

    public void setContador_p(Pedidos contador_p, int posicion) {
        this.contador_p.set(posicion, contador_p);
    }

    
}
