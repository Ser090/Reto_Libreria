package utilidades;

import java.io.Serializable;

/**
 *
 * @author Urko
 */
public enum MessageType implements Serializable {

    SIGN_IN_REQUEST,
    SIGN_UP_REQUEST,
    OK_RESPONSE,
    SIGNIN_ERROR,
    SIGNUP_ERROR,
    USER_EXIST_ERROR,
    BAD_RESPONSE,
    LOGIN_OK,
    LOGIN_EXIST_ERROR,
    SQL_ERROR,
    COUNTRIES_OK,
    COUNTRIES_REQUEST,
    COUNTRIES_ERROR

}
