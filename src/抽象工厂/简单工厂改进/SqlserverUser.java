package 抽象工厂.简单工厂改进;



public class SqlserverUser implements IUser {
    @Override
    public void insert(User User) {
        System.out.println("在SqlServer中给User表添加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Sqlserver中根据Id找到User表一条记录");
        return null;
    }
}
