import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Este programa demuestra la manipulación de archivos en Java.
 * Lee un archivo de texto llamado "entrada.txt", cuenta el número total de palabras
 * y escribe el resultado en un nuevo archivo llamado "salida.txt".
 */
public class ManipuladorArchivos {

    public static void main(String[] args) {
        // Nombres de los archivos de entrada y salida.
        String archivoEntrada = "entrada.txt";
        String archivoSalida = "salida.txt";
        int contadorPalabras = 0;

        System.out.println("Iniciando lectura del archivo: " + archivoEntrada);

        // Usamos try-with-resources para asegurar que los flujos se cierren automáticamente.
        // BufferedReader nos permite leer el archivo línea por línea de forma eficiente.
        try (BufferedReader reader = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            
            // Leemos el archivo línea por línea hasta que no haya más contenido (cuando linea sea null).
            while ((linea = reader.readLine()) != null) {
                // Si la línea no está vacía, procedemos a contar las palabras.
                if (!linea.trim().isEmpty()) {
                    // Usamos split con la expresión regular "\\s+" para dividir la línea por uno o más espacios en blanco.
                    // Esto nos da un array con todas las palabras de la línea.
                    String[] palabras = linea.split("\\s+");
                    contadorPalabras += palabras.length;
                }
            }
            System.out.println("Lectura completada. Total de palabras contadas: " + contadorPalabras);

        } catch (IOException e) {
            // Manejo de errores en caso de que el archivo de entrada no se encuentre o no se pueda leer.
            System.err.println("Error al leer el archivo '" + archivoEntrada + "': " + e.getMessage());
            // Termina el programa si hay un error de lectura.
            return;
        }

        System.out.println("Iniciando escritura en el archivo: " + archivoSalida);

        // Usamos try-with-resources para escribir en el archivo de salida.
        // PrintWriter nos facilita escribir texto formateado en el archivo.
        try (PrintWriter writer = new PrintWriter(new FileWriter(archivoSalida))) {
            writer.println("Análisis del archivo: " + archivoEntrada);
            writer.println("========================================");
            writer.println("El número total de palabras es: " + contadorPalabras);
            
            System.out.println("Resultados escritos exitosamente en " + archivoSalida);

        } catch (IOException e) {
            // Manejo de errores en caso de que no se pueda crear o escribir en el archivo de salida.
            System.err.println("Error al escribir en el archivo '" + archivoSalida + "': " + e.getMessage());
        }
    }
}