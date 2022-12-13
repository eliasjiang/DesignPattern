package 抽象工厂.简单工厂改进;



public class AccessUser implements IUser {
    @Override
    public void insert(User User) {
        System.out.println("在Access中给User表中增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在Access中根据id在user表中查到一条记录");
        return null;
    }
}
