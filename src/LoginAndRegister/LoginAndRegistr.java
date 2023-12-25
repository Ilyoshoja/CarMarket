package LoginAndRegister;

import bean.ApiResponce;
import bean.UserBean;
import db.DB;

public class LoginAndRegistr {

    static{
        UserBean user=new UserBean("admin","123","CarSystem");
        user.setId(0);
        DB.addUser(user);
    }

    public ApiResponce register(UserBean bean){
        UserBean user= DB.addUser(bean);

        if(user==null){
            return new ApiResponce(400,"Error",user);
        }else {
            return new ApiResponce(200,"Success",user);
        }
    }

    public ApiResponce login(UserBean bean){
        UserBean user=DB.getUser(bean);
        if(user==null){
            return new ApiResponce(400,"Error",user);
        }else {
            return new ApiResponce(200,"Success",user);
        }
    }
}
