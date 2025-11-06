/**
 * Program Assignment: PSP 2A
 * Name: [Karla Sofía Castro Pérez]
 * Date: [2025-06-11]
 * Description: Clase para contar líneas de código excluyendo comentarios y líneas vacías
 */

import java.util.*;

/**
 * Class LineCounter
 */
public class LineCounter {

  //
  // Fields
  //

  private int totalLines;
  private String[] artData;

  //
  // Constructors
  //
  public LineCounter () { };
  
  //
  // Methods
  //


/**
 * Cuenta líneas de código válidas excluyendo comentarios y líneas vacías
 * @param artData array de líneas de código a analizar
 * @return número total de líneas de código válidas
 */

public int count(String[] artData)
{
    int count = 0;
    for (String line : artData) {
        String trimmedLine = line.trim();
        
        // Excluir líneas que NO deben contarse
        if (trimmedLine.isEmpty() || 
            trimmedLine.startsWith("//") ||
            trimmedLine.equals("{") || 
            trimmedLine.equals("}") ||
            trimmedLine.startsWith("*") ||  // Comentarios Javadoc
            trimmedLine.startsWith("/*") || // Comentarios multi-línea
            trimmedLine.endsWith("*/")) {
            continue; // Saltar esta línea
        }
        
        // Si pasa todos los filtros, contar la línea
        count++;
    }
    return count;
}
}