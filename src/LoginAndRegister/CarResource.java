package LoginAndRegister;


import bean.ApiResponce;
import bean.CarBean;
import db.DB;

public class CarResource implements BaseCrudResoure<CarBean>{


    @Override
    public ApiResponce create(CarBean carBean) {

        boolean isCreate = DB.create(carBean);

        if (isCreate){
            return new ApiResponce(201, " Success ", carBean.getId());
        }else {
            return new ApiResponce(500, " Error ", null);
        }
    }

    @Override
    public ApiResponce get(Integer id) {
        CarBean car =DB.getCar(id);

        if(car==null){
            return new ApiResponce(400,"book not found",null);
        }else {
            return new ApiResponce(200,"book found",car);
        }

    }

    @Override
    public ApiResponce update(CarBean car) {
        boolean isUpdate = DB.update(car);

        if (isUpdate){
            return new ApiResponce(200, " Success ", car);
        }else {
            return new ApiResponce(400, " Error ", null);
        }
    }

    @Override
    public ApiResponce delete(Integer id) {
        boolean delete = DB.deleteCar(id);

        if (delete){
            return new ApiResponce(200, " Success ", null);
        }else {
            return new ApiResponce(400, " Error ", null);
        }

    }
}
