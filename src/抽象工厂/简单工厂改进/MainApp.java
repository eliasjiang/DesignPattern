package 抽象工厂.简单工厂改进;

public class MainApp {
    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        IUser iu = DataAccess.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();

        id.Insert(dept);
        id.getDepartment(1);

    }
}
