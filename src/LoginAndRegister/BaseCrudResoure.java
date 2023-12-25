package LoginAndRegister;

import bean.ApiResponce;
import bean.BaseIdBean;

public interface BaseCrudResoure  <T extends BaseIdBean>{

    ApiResponce create(T bean);

    ApiResponce get(Integer id);

    ApiResponce update(T bean);

    ApiResponce delete(Integer id);



}
