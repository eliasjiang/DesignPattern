package 抽象工厂.简单工厂改进;



public class AccessDepartment implements IDepartment {



    @Override
    public void Insert(Department department) {

    }

    @Override
    public Department getDepartment(int id) {
        System.out.println("在Acces中根据ID查到Department中一条记录");
        return null;
    }
}
