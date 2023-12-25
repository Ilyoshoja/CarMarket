package db;

import bean.CarBean;
import bean.UserBean;

import java.util.ArrayList;
import java.util.List;

public class DB {

    private static final List<UserBean> users = new ArrayList<>();
    private static final List<CarBean> carBeans = new ArrayList<>();
    public static UserBean session = null;

    public static UserBean addUser(UserBean bean) {
        if (checkUserExistByLogin(bean.getLogin())) {
            return null;
        }
        bean.setId(users.size());
        users.add(bean);
        return bean;
    }

    public static boolean checkUserExistByLogin(String login) {
        for (UserBean user : users) {
            if (user.getLogin().equals(login)) {
                return true;
            }
        }

        return false;
    }

    public static UserBean getUser(UserBean bean) {

        for (UserBean user : users) {
            if (user.getLogin().equals(bean.getLogin()) && user.getPassword().equals(bean.getPassword())) {
                return user;
            }
        }

        return null;
    }

    public static CarBean getCar(Integer id) {
        for (CarBean car : carBeans) {
            if (car.getUserId() == null && car.getId().equals(id)) {
                car.setUserId(DB.session.getId());
                return car;
            }
        }
        return null;
    }


    public static boolean update(CarBean updateCar) {
        for (CarBean car : carBeans) {
            if (car.getId().equals(updateCar.getId())) {

                car.setName(updateCar.getName());
                car.setAuthor(updateCar.getAuthor());
                car.setUserId(updateCar.getUserId());
                return true;
            }
        }
        return false;
    }


    public static boolean deleteCar(Integer id) {
        CarBean car = null;

        for (CarBean book : carBeans) {
            if (book.getId().equals(id)) {
                car = book;
                break;
            }
        }

        if (car != null) {
            carBeans.remove(car);
            return true;
        } else {
            return false;
        }
    }


    public static boolean create(CarBean newCar) {
        for (CarBean car : carBeans) {
            if (car.getId().equals(newCar.getId())) {
                return false;
            }
        }

        newCar.setUserId(DB.session.getId());
        carBeans.add(newCar);
        return true;
    }
}
