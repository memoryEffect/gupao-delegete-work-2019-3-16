package simple;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2019/3/16.
 */
public class Leader implements  IEmployee {
    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader(){
        targets.put("用户登陆",new EmployeeA());
        targets.put("文件加密",new EmployeeB());
    }
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }

}
