package RestauranteJyC;

import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

/**
 *
 * @author josep
 */
public class Mesa_platos {

    private int capacidad;
    private ArrayList<Pedidos> contador_p;
    private boolean lleno;
    private boolean vacio;
    private Semaphore poli;
    private JTextField Texto;

    public Mesa_platos(int capacidad, boolean lleno, JTextField Text) {
        this.capacidad = capacidad;
        this.lleno = lleno;
        poli = new Semaphore(capacidad, true);
        this.contador_p = contador_p;
        this.Texto = Text;
        contador_p = new ArrayList<>(capacidad);

    }

    public int getCapacidad() {
        return capacidad;
    }

    void dejar(Pedidos p) {
        try {
            poli.acquire();
            contador_p.add(p);
            String text = "5";
            for (int i = 0; i < contador_p.size(); i++) {

                text = text + (i + 1) + " | " + contador_p.get(i).getId();

            }
            Texto.setText(text);

        } catch (InterruptedException ex) {
            Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        int i;
        for (i = 0; capacidad > i; i++) {
            if (contador_p.get(i) == (new Pedidos("vacio"))) {
                lleno = false;
                break;
            } else {
                lleno = true;
            }

        }
        return lleno;
    }

    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public boolean isVacio() {
        int i;
        for (i = 0; i < capacidad; i++) {
            if (contador_p.get(i) != (new Pedidos("vacio"))) {
                vacio = false;
                break;
            } else {
                vacio = true;
            }

        }

        return vacio;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }

    public void setContador_p(int posicion, Pedidos almendra) {

        this.contador_p.set(posicion, almendra);

    }

    public Pedidos getPedidoMesa(int posicion) {
        Pedidos alpaca = contador_p.get(posicion);
        contador_p.get(posicion);
        return alpaca;
    }

    public  Pedidos coger() {
        System.out.println("Mesa--"+contador_p.size());
        
        Pedidos p;
        /*while(contador_p.get(0) == null) {
             
            try {
                wait(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }*/
        p = this.contador_p.get(0);
        
        poli.release();
        
        contador_p.remove(p);
        return p;
    }

}
