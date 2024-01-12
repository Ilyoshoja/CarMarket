package LoginAndRegister;

import bean.ApiResponse;
import bean.User;
import db.DB;

public class LoginAndRegister {

    static{
        User user=new User("admin","123","CarSystem");
        user.setId(0);
        DB.addUser(user);
    }

    public ApiResponse register(User us){
        User user= DB.addUser(us);

        if(user==null){
            return new ApiResponse(400,"Error",user);
        }else {
            return new ApiResponse(200,"Success",user);
        }
    }

    public ApiResponse login(User us){
        User user=DB.getUser(us);
        if(user==null){
            return new ApiResponse(400,"Error",user);
        }else {
            return new ApiResponse(200,"Success",user);
        }
    }
}
