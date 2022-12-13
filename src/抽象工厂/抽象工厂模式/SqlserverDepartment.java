package 抽象工厂.抽象工厂模式;

public class SqlserverDepartment implements IDepartment{
    @Override
    public void Insert(Department department) {
        System.out.println("在Sqlserver 中给Department增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在sqlserver 中根据Id查到Department一条记录");
        return null;
    }
}
