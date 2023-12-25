package bean;

import bean.BaseIdBean;

public class UserBean extends BaseIdBean {
    private String name;
    private String password;
    private String role;

    public UserBean() {
    }

    public UserBean(String name, String password) {
        this.name= name;
        this.password = password;
    }

    public UserBean(String name, String password, String role) {
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getLogin() {
        return name;
    }

    public void setLogin(String login) {
        this.name = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}