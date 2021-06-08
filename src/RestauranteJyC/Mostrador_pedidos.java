package RestauranteJyC;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;

public class Mostrador_pedidos {
    //atributos y los semáforos
    private int capacidad;
    private boolean lleno;
    private ArrayList<Pedidos> contador_p;
    private Semaphore poli;
    private Semaphore uno;
    private Semaphore critico;
    private JTextField Texto;

    public Mostrador_pedidos(int capacidad, boolean lleno, JTextField Text) { //constructor
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
        uno.acquire(); //activa semaforo
        critico.acquire(); 
        System.out.println("Mostrador--" + contador_p.size()); //muestra el número de mostrador
        Pedidos pedido;

        pedido = contador_p.get(0);
        poli.release(); //libera los semaforos
        critico.release();
        contador_p.remove(pedido);
        return pedido;
    }

    void insert(Pedidos pedidos) {
        try {
            poli.acquire(); //activa semaforos
            critico.acquire();
            contador_p.add(pedidos); //añade uno al array de pedidos
            String text = "";
            for (int i = 0; i < contador_p.size(); i++) { //sube el contaodr

                text = text +"| " + contador_p.get(i).getId();

            }
            Texto.setText(text); //setea el texto 
            critico.release(); //libera semaforos
            uno.release();
        } catch (InterruptedException ex) {
            Logger.getLogger(Mostrador_pedidos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //metodos get y sets
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
