package 抽象工厂.抽象工厂模式;

public class AccessDepartment implements IDepartment{
    @Override
    public void Insert(Department department) {
        System.out.println("在Access 中给Department添加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Acces中根据ID查到Department中一条记录");
        return null;
    }
}
