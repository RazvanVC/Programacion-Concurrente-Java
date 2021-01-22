/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteRyD;

import com.sun.istack.internal.logging.Logger;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;

/**
 *
 * @author razvanvc
 */
public class LogRestaurante {

    private BufferedWriter escritor;
    private final String rutaEscritura;
    private final File archivo;

    public LogRestaurante(String ruta) {
        this.rutaEscritura = ruta;
        archivo = new File(ruta);
        crearArchivo();
    }

    private void crearArchivo() {
        try {
            if (archivo.exists()) {
                escritor = new BufferedWriter(new FileWriter(archivo));
                escritor.write("Fichero abierto : " + new Date().toString() + "\n");
            } else {
                escritor = new BufferedWriter(new FileWriter(archivo));
                escritor.write("Fichero creado : " + new Date().toString() + "\n");
            }
            escritor.close();
        } catch (IOException e) {
        }
    }

    public void escribirLog(String evento) {
        FileWriter fw = null;
        try {
            if (archivo.exists()) {
                fw = new FileWriter(rutaEscritura, true);
                escritor = new BufferedWriter(fw);
                escritor.write(new Date().toString() + " ------- " + evento + "\n");
                escritor.close();
            } else {
                crearArchivo();
            }
        } catch (IOException e) {
        } finally {
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                }
            }
        }

    }
}
