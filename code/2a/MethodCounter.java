/**
 * Program Assignment: PSP 2A
 * Name: [Karla Sofía Castro Pérez]
 * Date: [2025-06-11]
 * Description: Clase para contar métodos públicos en código Java
 */

import java.util.*;

/**
 * Class MethodCounter
 */
public class MethodCounter {

  //
  // Fields
  //

  private int totalMethods;
  private String[] artData;

  /**
 * Cuenta métodos públicos en un array de líneas de código
 * @param artData array de líneas de código a analizar
 * @return número total de métodos públicos encontrados
 */

public int count(String[] artData)
{
    int count = 0;
    for (String line : artData) {
        String trimmedLine = line.trim();
        
        // Contar métodos públicos que no sean constructores vacíos
        if (trimmedLine.startsWith("public") && 
            trimmedLine.contains("(") && 
            trimmedLine.contains(")") && 
            !trimmedLine.contains("class") &&
            !trimmedLine.startsWith("//") &&
            !trimmedLine.endsWith("{}") && 
            !trimmedLine.endsWith(");")) { 
            count++;
        }
    }
    return count;
}
}