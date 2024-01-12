package bean;

public class Car extends BaseIdBean {
    //TODO

    private String name;
    private String surname;
    private Integer userId;
    private boolean isStore;

    public void setStore(boolean store) {
        isStore = store;
    }

    public Car() {
    }

    public Car(String name, String surname, Integer userId, boolean isStore) {
        this.name = name;
        this.surname = surname;
        this.userId = userId;
        this.isStore = isStore;
    }

    public boolean isStore() {
        return isStore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
