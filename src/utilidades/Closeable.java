package utilidades;

/**
 * Interfaz Closeable: define un contrato para clases que requieren una
 * operación de cierre.
 *
 * Esta interfaz proporciona el método `close()` que debe implementarse para
 * liberar recursos o realizar cualquier acción de finalización que requiera la
 * clase que la implemente. Es especialmente útil en casos donde se necesite
 * asegurar que ciertos recursos, como conexiones de red o archivos, se cierren
 * de manera controlada al terminar su uso.
 *
 * Métodos: - `close()`: método sin parámetros que realiza el cierre de la
 * instancia.
 *
 * Ejemplo de implementación:
 *
 * <pre>
 * public class ConexionBD implements Closeable {
 *
 *     @Override
 *     public void close() {
 *         // Lógica para cerrar la conexión a la base de datos
 *     }
 * }
 * </pre>
 *
 * @author Sergio
 */
public interface Closeable {

    /**
     * Cierra el recurso asociado con esta instancia. Implementa la lógica
     * necesaria para liberar recursos al cerrar la instancia.
     */
    public void close();
}
