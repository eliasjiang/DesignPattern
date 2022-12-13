package 抽象工厂.简单工厂改进;




public interface IDepartment {
    public void Insert(Department department);

    Department getDepartment(int id);
}
