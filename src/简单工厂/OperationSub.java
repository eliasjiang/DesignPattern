package 简单工厂;

public class OperationSub extends Operation{

    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
