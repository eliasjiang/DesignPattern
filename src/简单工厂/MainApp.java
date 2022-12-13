package 简单工厂;

public class MainApp {


    public static void main(String[] args) {
        Operation oper = OperationFactory.createOperate("+");
        oper.setNumberA(1);
        oper.setNumberB(2);
        double result = oper.getResult();
        System.out.println(result);
    }

}
