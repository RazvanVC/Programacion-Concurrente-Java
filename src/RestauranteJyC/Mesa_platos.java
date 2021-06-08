package RestauranteJyC;

import java.io.IOException;
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
     //Creacion de atributos
    private int capacidad;
    private ArrayList<Pedidos> contador_p;
    private boolean lleno;
    private boolean vacio;
    private Semaphore poli;
    private Semaphore uno;
    private Semaphore critico;
    private JTextField Texto;

    public Mesa_platos(int capacidad, boolean lleno, JTextField Text) { //constructor
        this.capacidad = capacidad;
        this.lleno = lleno;
        poli = new Semaphore(capacidad, true);
        this.contador_p = contador_p;
        this.Texto = Text;
        contador_p = new ArrayList<>(capacidad);
        critico = new Semaphore(1);
        uno = new Semaphore(0);

    }

    public void dejar(Pedidos p) { //Metodo para dejar los platos
        try {
            poli.acquire(); //inicio de semaforos y contadores 
            critico.acquire();
            contador_p.add(p);
            String text = "";
            // aumenta el número las veces que sea necesario
            for (int i = 0; i < contador_p.size(); i++) {
                text = text +" | " + contador_p.get(i).getId();
            }
            //escribe el texto y libera los semáforos
            Texto.setText(text);
            critico.release();
            uno.release();

        } catch (InterruptedException ex) {
            Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Pedidos coger() throws InterruptedException, SecurityException, IOException {
        //inicia semáforos
        uno.acquire();
        critico.acquire();

        System.out.println("Mesa--" + contador_p.size()); //imprime el nivel de la mesa
        Pedidos p;
        p = this.contador_p.get(0);
        contador_p.remove(p); //quita uno del contador
        //libera los semáforos
        poli.release();
        critico.release();

        return p;
    }
    //metodos get y set
    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isLleno() {
        return lleno;
    }

    public boolean isVacio() {
        return vacio;
    }
    
    public void setLleno(boolean lleno) {
        this.lleno = lleno;
    }

    public void setVacio(boolean vacio) {
        this.vacio = vacio;
    }

    public ArrayList<Pedidos> getContador_p() {
        return contador_p;
    }

}
