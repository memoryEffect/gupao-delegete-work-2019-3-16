package simple;

/**
 * Created by Administrator on 2019/3/16.
 */
public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是A员工，我现在开始干"+command+"工作");
    }
}
