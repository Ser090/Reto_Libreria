package utilidades;

import java.io.Serializable;

/**
 * Clase User: representa un usuario con atributos básicos de identificación y
 * ubicación.
 *
 * Esta clase encapsula la información de un usuario, incluyendo detalles de
 * acceso (login y contraseña), así como datos de identificación personal y
 * dirección postal. Es serializable, lo cual permite su transmisión en una red
 * o almacenamiento en disco de manera fácil y segura.
 *
 * Atributos: - `resUserId`: identificador único del usuario en la base de
 * datos. - `login`: nombre de usuario utilizado para el inicio de sesión. -
 * `pass`: contraseña del usuario. - `name`: nombre completo del usuario. -
 * `street`: dirección postal del usuario (calle). - `zip`: código postal del
 * usuario. - `city`: ciudad en la que reside el usuario. - `active`: estado de
 * actividad del usuario (si está activo o no).
 *
 * Métodos: - Constructor sin parámetros para crear un usuario vacío. -
 * Constructor con parámetros para inicializar todos los atributos excepto
 * `resUserId`. - Métodos `get` y `set` para acceder y modificar cada uno de los
 * atributos.
 *
 * @author Urko
 */
public class User implements Serializable {

    private Integer resUserId;
    private String login;
    private String pass;
    private String name;
    private String street;
    private String zip;
    private String city;
    private Boolean active;

    /**
     * Constructor por defecto que crea un objeto User sin inicializar los
     * campos.
     */
    public User() {
    }

    /**
     * Constructor que permite inicializar un objeto User con todos los datos,
     * excepto el identificador único `resUserId`.
     *
     * @param login Nombre de usuario para el inicio de sesión
     * @param pass Contraseña del usuario
     * @param name Nombre completo del usuario
     * @param street Dirección postal del usuario
     * @param zip Código postal
     * @param city Ciudad de residencia
     * @param active Estado de actividad del usuario
     */
    public User(String login, String pass, String name, String street, String zip, String city, Boolean active) {
        this.login = login;
        this.pass = pass;
        this.name = name;
        this.street = street;
        this.zip = zip;
        this.city = city;
        this.active = active;
    }

    /**
     * Obtiene el identificador único del usuario.
     *
     * @return el ID del usuario en la base de datos
     */
    public Integer getResUserId() {
        return resUserId;
    }

    /**
     * Establece el identificador único del usuario.
     *
     * @param resUserId ID del usuario en la base de datos
     */
    public void setResUserId(Integer resUserId) {
        this.resUserId = resUserId;
    }

    /**
     * Obtiene el nombre de usuario para el inicio de sesión.
     *
     * @return el nombre de usuario (login)
     */
    public String getLogin() {
        return login;
    }

    /**
     * Establece el nombre de usuario para el inicio de sesión.
     *
     * @param login nombre de usuario
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * Obtiene la contraseña del usuario.
     *
     * @return la contraseña del usuario
     */
    public String getPass() {
        return pass;
    }

    /**
     * Establece la contraseña del usuario.
     *
     * @param pass contraseña del usuario
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * Obtiene el nombre completo del usuario.
     *
     * @return el nombre del usuario
     */
    public String getName() {
        return name;
    }

    /**
     * Establece el nombre completo del usuario.
     *
     * @param name nombre completo del usuario
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Obtiene la dirección postal del usuario (calle).
     *
     * @return la calle del usuario
     */
    public String getStreet() {
        return street;
    }

    /**
     * Establece la dirección postal del usuario.
     *
     * @param street calle del usuario
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Obtiene el código postal del usuario.
     *
     * @return el código postal
     */
    public String getZip() {
        return zip;
    }

    /**
     * Establece el código postal del usuario.
     *
     * @param zip código postal
     */
    public void setZip(String zip) {
        this.zip = zip;
    }

    /**
     * Obtiene la ciudad de residencia del usuario.
     *
     * @return la ciudad del usuario
     */
    public String getCity() {
        return city;
    }

    /**
     * Establece la ciudad de residencia del usuario.
     *
     * @param city ciudad del usuario
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Obtiene el estado de actividad del usuario.
     *
     * @return true si el usuario está activo, false en caso contrario
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * Establece el estado de actividad del usuario.
     *
     * @param active true para activar el usuario, false para desactivarlo
     */
    public void setActive(Boolean active) {
        this.active = active;
    }
}
