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
 * Tipos de mensajes: - `SIGN_IN_REQUEST`: Solicitud para iniciar sesión. -
 * `SIGN_UP_REQUEST`: Solicitud para registrarse. - `OK_RESPONSE`: Respuesta
 * indicando que la operación fue exitosa. - `SIGNIN_ERROR`: Error durante el
 * inicio de sesión. - `SIGNUP_ERROR`: Error durante el registro. -
 * `BAD_RESPONSE`: Respuesta indicando que ocurrió un error desconocido. -
 * `LOGIN_OK`: Inicio de sesión exitoso. - `LOGIN_EXIST_ERROR`: Error indicando
 * que el nombre de usuario ya existe. - `SQL_ERROR`: Error de base de datos
 * SQL. - `CONNECTION_ERROR`: Error de conexión al servidor. - `SERVER_ERROR`:
 * Error interno del servidor. - `NON_ACTIVE`: El usuario está inactivo.
 *
 * Este enum facilita la comunicación y el control de errores en el sistema de
 * autenticación.
 *
 * @author Urko
 */
public enum MessageType implements Serializable {

    /**
     * Solicitud para iniciar sesión.
     */
    SIGN_IN_REQUEST,
    /**
     * Solicitud para registrarse.
     */
    SIGN_UP_REQUEST,
    /**
     * Respuesta indicando que la operación fue exitosa.
     */
    OK_RESPONSE,
    /**
     * Error durante el inicio de sesión.
     */
    SIGNIN_ERROR,
    /**
     * Error durante el registro.
     */
    SIGNUP_ERROR,
    /**
     * Respuesta indicando que ocurrió un error desconocido.
     */
    BAD_RESPONSE,
    /**
     * Inicio de sesión exitoso.
     */
    LOGIN_OK,
    /**
     * Error indicando que el nombre de usuario ya existe.
     */
    LOGIN_EXIST_ERROR,
    /**
     * Error de base de datos SQL.
     */
    SQL_ERROR,
    /**
     * Error de conexión al servidor.
     */
    CONNECTION_ERROR,
    /**
     * Error interno del servidor.
     */
    SERVER_ERROR,
    /**
     * El usuario está inactivo.
     */
    NON_ACTIVE,
    GET_USER,
    GET_OK,
    GET_FAIL
}
