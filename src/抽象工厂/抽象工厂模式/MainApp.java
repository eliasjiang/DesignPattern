package 抽象工厂.抽象工厂模式;

import java.io.Console;
import java.lang.constant.Constable;

public class MainApp
{


    public static void main(String[] args) {
        User user = new User();
        Department dept = new Department();

        IFactory factory = new AccessFactory();

        IUser iu = factory.CreateUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment id = factory.CreateDepartment();
        id.Insert(dept);
        id.getDepartment(1);


    }

}
