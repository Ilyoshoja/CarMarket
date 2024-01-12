package db;

import bean.Car;
import bean.User;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static User session=null;
    private static final List<User> users=new ArrayList<>();
    private static final List<Car> cars=new ArrayList<>();

    public static User addUser(User user) {
        if (checkUserExistByLogin(user.getName())) {
            return null;
        }
        user.setId(users.size());
        users.add(user);
        return user;
    }

    public static boolean checkUserExistByLogin(String login) {
        for (User user : users) {
            if (user.getName().equals(login)) {
                return true;
            }
        }

        return false;
    }

    public static User getUser(User us) {

        for (User user : users) {
            if (user.getName().equals(us.getName()) && user.getPassword().equals(us.getPassword())) {
                return user;
            }
        }

        return null;
    }


    public static Car addCar(Car car) {
        for (Car cr : cars) {
            if (cr.getId().equals(car.getId())) {
                return null;
            }
        }

        car.setUserId(DB.session.getId());
        cars.add(car);
        return car;
    }


    public static Car getCar(Integer id) {
        for (Car car : cars) {
            if (car.getUserId() == null && car.getId().equals(id)) {
                car.setUserId(DB.session.getId());
                return car;
            }
        }
        return null;
    }



    public static List<Car> getAvailableCars(){
        List<Car> cr = new ArrayList<>();

        for (Car car:cars){
            if (car.isStore() && car.getUserId()==null){
                cr.add(car);
            }
        }
        return cr;
    }


    public static List<Car> showAllCars(){
        return cars;
    }

    public static boolean update(Car updateCar) {
        for (Car car : cars) {
            if (car.getId().equals(updateCar.getId())) {

                car.setName(updateCar.getName());
                car.setSurname(updateCar.getSurname());
                car.setUserId(updateCar.getUserId());
                return true;
            }
        }
        return false;
    }


    public static boolean deleteCar(Integer id) {
        Car car = null;

        for (Car book : cars) {
            if (book.getId().equals(id)) {
                car = book;
                break;
            }
        }

        if (car != null) {
            cars.remove(car);
            return true;
        } else {
            return false;
        }
    }

}
