/**
 * Program Assignment: PSP 2A
 * Name: [Karla Sofía Castro Pérez]
 * Date: [2025-06-11]
 * Description: Clase para escritura de resultados en archivos
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class OutPut {

    /**
     * Default constructor
     */
    public OutPut() {
    }


    /**
     * Escribe texto en un archivo especificado
     * @param outFile nombre del archivo de salida
     * @param outText texto a escribir en el archivo
     */
   public void writeData(String outFile, String outText) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outFile))) {
            bw.write(outText);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}