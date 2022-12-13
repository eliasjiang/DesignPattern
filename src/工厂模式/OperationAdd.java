package 工厂模式;



public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
