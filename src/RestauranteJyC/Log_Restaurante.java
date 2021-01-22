/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RestauranteJyC;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author necok
 */
public class Log_Restaurante {

    public Logger log;
    FileHandler archivoLog;
    File txt;
    
    public Log_Restaurante(String logTxt) throws SecurityException, IOException {
        
        txt = new File(logTxt);
        if (!txt.exists()) {
            try {
                txt.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(Log_Restaurante.class.getName()).log(Level.SEVERE, null, ex);
            }
            archivoLog = new FileHandler(logTxt, false);
            log = Logger.getLogger("evolucionRestaurante.txt");
            log.addHandler(archivoLog);
            
            SimpleFormatter formatoEstandar = new SimpleFormatter();
            archivoLog.setFormatter(formatoEstandar);

        } else {
            archivoLog = new FileHandler(logTxt, false);
            log = Logger.getLogger("evolucionRestaurante.txt");
            log.addHandler(archivoLog);
            
            SimpleFormatter formatoEstandar = new SimpleFormatter();
            archivoLog.setFormatter(formatoEstandar);
        }

    }
}
