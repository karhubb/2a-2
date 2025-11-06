/**
 * Program Assignment: PSP 2A
 * Name: [Karla Sofía Castro Pérez]
 * Date: [2025-06-11]
 * Description: Clase para lectura de archivos de código fuente
 */

import java.io.*;

/**
 * data : string
 * data : string
 */
public class Input {

    /**
     * Default constructor
     */
    public Input() {
    }

    /**
     * 
     */
    private String data;

    /**
     * 
     */
    private BufferedReader br = null;

    /**
     * Lee el contenido de un archivo y lo retorna como String
     * @param inFile nombre del archivo a leer
     * @return contenido del archivo como String, o string vacío en caso de error
     */
     public String readData(String inFile) {
        StringBuilder data = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(inFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                data.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "";  // CORREGIDO: retornar string vacío en caso de error
        }
        return data.toString();
    }
}