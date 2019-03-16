package simple;

/**
 * Created by Administrator on 2019/3/16.
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，现在开始干"+command+"工作");
    }
}
