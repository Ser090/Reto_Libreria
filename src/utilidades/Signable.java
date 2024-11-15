package utilidades;

/**
 * Interfaz Signable: define métodos para la autenticación de usuarios.
 *
 * Esta interfaz proporciona dos métodos fundamentales para gestionar el
 * registro (signUp) e inicio de sesión (signIn) de usuarios en el sistema. Los
 * métodos esperan recibir un objeto User y retornan un objeto Message que puede
 * contener información sobre el resultado de la operación, como éxito o
 * detalles de error.
 *
 * Métodos: - `signUp(User user)`: permite registrar un nuevo usuario en el
 * sistema. - `signIn(User user)`: permite autenticar un usuario ya registrado.
 *
 * @author Urko
 */
public interface Signable {

    /**
     * Registra un nuevo usuario en el sistema.
     *
     * @param user el objeto User que contiene los datos del usuario a registrar
     * @return un objeto Message con el resultado del registro
     */
    public Message signUp(User user);

    /**
     * Autentica un usuario ya registrado en el sistema.
     *
     * @param user el objeto User que contiene los datos del usuario para
     * autenticación
     * @return un objeto Message con el resultado de la autenticación
     */
    public Message signIn(User user);

    public Message getUser(User user);
}
