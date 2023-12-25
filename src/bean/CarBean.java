package bean;

public class CarBean extends BaseIdBean {
    private String name;
    private String surname;
    private Integer userId;

    public CarBean() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return surname;
    }

    public void setAuthor(String surname) {
        this.surname = surname;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}