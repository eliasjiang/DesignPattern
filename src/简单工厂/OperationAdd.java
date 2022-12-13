package 简单工厂;

public class OperationAdd extends Operation{
    @Override
    public double getResult() {
        return getNumberA()+getNumberB();
    }
}
