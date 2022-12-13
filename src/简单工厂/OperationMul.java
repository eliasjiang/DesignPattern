package 简单工厂;

public class OperationMul extends Operation{
    @Override
    public double getResult() {
        return getNumberA()*getNumberB();
    }
}
