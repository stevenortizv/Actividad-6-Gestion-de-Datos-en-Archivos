import java.io.Serializable;

/**
 * Clase que representa a un Usuario.
 * Esta clase implementa la interfaz 'Serializable', lo que indica a Java
 * que los objetos de esta clase pueden ser convertidos a una secuencia de bytes
 * para ser guardados en un archivo o transmitidos por red.
 */
public class Usuario implements Serializable {

    /**
     * El serialVersionUID es un identificador único para la versión de la clase.
     * Es importante para el proceso de deserialización, para asegurar que el objeto
     * guardado y la clase que lo carga son compatibles.
     */
    private static final long serialVersionUID = 1L;

    // Atributos del usuario.
    private String nombre;
    private String email;
    // La palabra clave 'transient' indica que este atributo no debe ser serializado.
    // Es útil para datos sensibles como contraseñas o datos que no necesitan persistir.
    transient private String password; 
    private int edad;

    // Constructor para inicializar el objeto Usuario.
    public Usuario(String nombre, String email, String password, int edad) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.edad = edad;
    }

    // Sobrescribimos el método toString() para obtener una representación en texto del objeto.
    // Esto es útil para imprimir la información del objeto de forma clara.
    @Override
    public String toString() {
        return "Usuario {" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", password='" + (password == null ? "NO GUARDADO" : password) + '\'' +
                ", edad=" + edad +
                '}';
    }
}