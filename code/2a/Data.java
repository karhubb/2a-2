/**
 * Program Assignment: PSP 2A
 * Name: [Karla Sofía Castro Pérez]
 * Date: [2025-06-11]
 * Description: Clase para procesamiento y conversión de datos
 */

public class Data {

    /**
     * Default constructor
     */
    public Data() {
    }

    /**
     * Convierte un String en un array de líneas separadas
     * @param data String con contenido a dividir
     * @return array de Strings con cada línea del contenido
     */
     public String[] saveData(String data) {
        return data.split("\n");
    }
}