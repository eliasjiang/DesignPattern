package 抽象工厂.抽象工厂模式;

public class SqlserverFactory implements IFactory{
    public IUser CreateUser(){
        return new SqlserverUser();
    }

    @Override
    public IDepartment CreateDepartment() {
        return new SqlserverDepartment();
    }
}
