package utilidades;

import java.io.Serializable;

/**
 * Clase Message: representa un mensaje utilizado en la comunicación dentro del
 * sistema.
 *
 * La clase `Message` encapsula un mensaje, compuesto por un tipo específico
 * (`MessageType`) y un objeto asociado, que puede ser cualquier dato relevante
 * para la operación, como un usuario, un resultado de operación o un mensaje de
 * error.
 *
 * Atributos: - `type`: tipo de mensaje, definido por la enumeración
 * `MessageType`, que indica el propósito del mensaje. - `object`: objeto
 * asociado al mensaje, que puede contener datos adicionales, como detalles de
 * usuario o errores.
 *
 * Métodos: - Constructor `Message(MessageType type, Object object)`: permite
 * crear un mensaje con un tipo y un objeto asociado. - `getType()`: obtiene el
 * tipo de mensaje. - `setType(MessageType type)`: establece el tipo de mensaje.
 * - `getObject()`: obtiene el objeto asociado al mensaje. - `setObject(Object
 * object)`: establece el objeto asociado al mensaje.
 *
 * Ejemplo de uso:
 *
 * <pre>
 * Message mensaje = new Message(MessageType.SIGN_IN_REQUEST, usuario);
 * if (mensaje.getType() == MessageType.OK_RESPONSE) {
 *     System.out.println("Operación realizada con éxito.");
 * }
 * </pre>
 *
 * @see MessageType
 * @see Serializable
 *
 * Nota: Al ser serializable, la clase `Message` permite la transmisión segura
 * de sus datos a través de la red o su almacenamiento en disco.
 *
 * ¡Importante! Al utilizar `object`, asegúrate de manejar el tipo de dato
 * correctamente para evitar errores de tipo o de conversión.
 *
 * @param type tipo de mensaje
 * @param object objeto asociado al mensaje
 *
 * @autor Urko
 */
public class Message implements Serializable {

    private MessageType type;
    private Object object;

    /**
     * Constructor que inicializa el mensaje con un tipo y un objeto.
     *
     * @param type el tipo de mensaje, definido por `MessageType`
     * @param object el objeto asociado al mensaje
     */
    public Message(MessageType type, Object object) {
        this.type = type;
        this.object = object;
    }

    /**
     * Obtiene el tipo de mensaje.
     *
     * @return el tipo de mensaje (MessageType)
     */
    public MessageType getType() {
        return type;
    }

    /**
     * Establece el tipo de mensaje.
     *
     * @param type el tipo de mensaje a establecer
     */
    public void setType(MessageType type) {
        this.type = type;
    }

    /**
     * Obtiene el objeto asociado al mensaje.
     *
     * @return el objeto asociado al mensaje
     */
    public Object getObject() {
        return object;
    }

    /**
     * Establece el objeto asociado al mensaje.
     *
     * @param object el objeto a asociar al mensaje
     */
    public void setObject(Object object) {
        this.object = object;
    }
}
