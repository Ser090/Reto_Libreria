package utilidades;

import java.io.Serializable;

/**
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

    public User() {
    }

    public User(Integer resUserId, String login, String pass, String street, String zip, String city) {
        this.resUserId = resUserId;
        this.login = login;
        this.pass = pass;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public Integer getResUserId() {
        return resUserId;
    }

    public void setResUserId(Integer resUserId) {
        this.resUserId = resUserId;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
