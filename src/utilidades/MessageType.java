package utilidades;

import java.io.Serializable;

/**
 * Enumeración MessageType: define los distintos tipos de mensajes utilizados en
 * el sistema.
 *
 * Esta enumeración proporciona una lista de constantes que representan los
 * diferentes tipos de mensajes que pueden ser intercambiados durante los
 * procesos de registro, inicio de sesión y comunicación general en el sistema.
 * Cada tipo de mensaje indica un estado o una solicitud específica, facilitando
 * la identificación y manejo de cada caso.
 *
 * Tipos de mensajes: - `SIGN_IN_REQUEST`: solicitud para iniciar sesión. -
 * `SIGN_UP_REQUEST`: solicitud para registrarse. - `OK_RESPONSE`: respuesta
 * indicando que la operación fue exitosa. - `SIGNIN_ERROR`: error durante el
 * inicio de sesión. - `SIGNUP_ERROR`: error durante el registro. -
 * `BAD_RESPONSE`: respuesta indicando que ocurrió un error desconocido. -
 * `LOGIN_OK`: inicio de sesión exitoso. - `LOGIN_EXIST_ERROR`: error indicando
 * que el login ya existe. - `SQL_ERROR`: error de base de datos SQL. -
 * `CONNECTION_ERROR`: error de conexión al servidor. - `SERVER_ERROR`: error
 * interno del servidor. - `NON_ACTIVE`: el usuario está inactivo.
 *
 * Este enum facilita la comunicación y el control de errores en el sistema de
 * autenticación.
 *
 * @see Serializable
 *
 * Ejemplo de uso:  <pre>
 * MessageType messageType = MessageType.SIGN_IN_REQUEST;
 * if (messageType == MessageType.OK_RESPONSE) {
 *     System.out.println("Operación exitosa.");
 * }
 * </pre>
 *
 * @author Urko
 */
public enum MessageType implements Serializable {

    SIGN_IN_REQUEST,
    SIGN_UP_REQUEST,
    OK_RESPONSE,
    SIGNIN_ERROR,
    SIGNUP_ERROR,
    BAD_RESPONSE,
    LOGIN_OK,
    LOGIN_EXIST_ERROR,
    SQL_ERROR,
    CONNECTION_ERROR,
    SERVER_ERROR,
    NON_ACTIVE
}
