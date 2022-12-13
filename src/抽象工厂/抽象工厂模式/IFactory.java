package 抽象工厂.抽象工厂模式;

public interface IFactory {
    IUser CreateUser();
    IDepartment CreateDepartment();
}
