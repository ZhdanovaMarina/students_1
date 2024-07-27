package entity;

import java.util.ArrayList;
import java.util.List;

public class User {

    private int id;
    private String login;
    private String password;

    private List<Role> roles = new ArrayList<>();

    public User() {
    }

    public User(String login, int id, String password) {
        this.login = login;
        this.id = id;
        this.password = password;
    }

    public void addRole(Role role){
        roles.add(role);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
