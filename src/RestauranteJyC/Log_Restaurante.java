
package RestauranteJyC;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log_Restaurante {

    public Logger log; //crea un logger
    FileHandler archivoLog; // crea el FileHandler

    public Log_Restaurante(String logTxt) throws SecurityException, IOException {

        File txt = new File(logTxt); // crea el txt donde va a escribir
        if (!txt.exists()) { //si no existe crea un nuevo txt
            try {
                txt.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Log_Restaurante.class.getName()).log(Level.SEVERE, null, ex);
            }//lo escribe en el log
            archivoLog = new FileHandler(logTxt, false);
            log = Logger.getLogger("evolucionRestaurante.txt");
            log.addHandler(archivoLog);
            SimpleFormatter formatoEstandar = new SimpleFormatter();//establece formato
            archivoLog.setFormatter(formatoEstandar);

        } else { // si no tiene que crearlo, lo escribe en el log igualmente
            archivoLog = new FileHandler(logTxt, false);
            log = Logger.getLogger("evolucionRestaurante.txt");
            log.addHandler(archivoLog);
            SimpleFormatter formatoEstandar = new SimpleFormatter();
            archivoLog.setFormatter(formatoEstandar);
        }

    }
}
