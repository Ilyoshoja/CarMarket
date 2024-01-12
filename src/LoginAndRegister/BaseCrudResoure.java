package LoginAndRegister;


import bean.ApiResponse;
import bean.BaseIdBean;

public interface BaseCrudResoure <T extends BaseIdBean>{

    ApiResponse create(T bean);

    ApiResponse get(Integer id);

    ApiResponse update(T bean);

    ApiResponse delete(Integer id);
}
