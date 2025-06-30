import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Este programa demuestra la serialización y deserialización de un objeto.
 * Primero, crea una instancia de la clase 'Usuario', la serializa y la guarda
 * en un archivo binario. Luego, deserializa el objeto desde el archivo y
 * muestra su contenido en la consola.
 */
public class Serializador {

    public static void main(String[] args) {
        // Nombre del archivo donde se guardará el objeto serializado.
        // La extensión ".ser" es una convención común para archivos serializados.
        String archivoSerializado = "usuario.ser";

        // 1. CREACIÓN Y SERIALIZACIÓN DEL OBJETO
        
        // Creamos una instancia de la clase Usuario que queremos guardar.
        Usuario usuarioOriginal = new Usuario("Alex Marin", "alex.marin@example.com", "secreto123", 30);

        System.out.println("--- Proceso de Serialización ---");
        System.out.println("Objeto original a guardar: " + usuarioOriginal);

        // Usamos try-with-resources para la serialización.
        // ObjectOutputStream escribe objetos Java en un flujo de salida.
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoSerializado))) {
            // El método writeObject() convierte el objeto a bytes y lo escribe en el archivo.
            oos.writeObject(usuarioOriginal);
            System.out.println("Objeto serializado y guardado en: " + archivoSerializado);
        } catch (IOException e) {
            System.err.println("Error durante la serialización: " + e.getMessage());
            e.printStackTrace();
        }

        System.out.println("\n--- Proceso de Deserialización ---");

        // 2. DESERIALIZACIÓN DEL OBJETO

        Usuario usuarioRecuperado = null;

        // Usamos try-with-resources para la deserialización.
        // ObjectInputStream lee objetos Java desde un flujo de entrada.
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoSerializado))) {
            // El método readObject() lee los bytes y los reconstruye en un objeto Java.
            // Es necesario hacer un "cast" al tipo de objeto esperado (Usuario).
            usuarioRecuperado = (Usuario) ois.readObject();
            System.out.println("Objeto deserializado exitosamente desde: " + archivoSerializado);
        } catch (IOException | ClassNotFoundException e) {
            // Se pueden lanzar dos excepciones:
            // IOException: si hay un problema al leer el archivo.
            // ClassNotFoundException: si la clase del objeto no se encuentra en el proyecto.
            System.err.println("Error durante la deserialización: " + e.getMessage());
            e.printStackTrace();
        }

        // 3. VERIFICACIÓN
        
        // Mostramos el objeto recuperado para verificar que el proceso funcionó.
        if (usuarioRecuperado != null) {
            System.out.println("Objeto recuperado: " + usuarioRecuperado);
            System.out.println("Nota: El campo 'password' es nulo porque fue declarado como 'transient' y no se serializó.");
        }
    }
}