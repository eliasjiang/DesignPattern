package 工厂模式;



public class OperationSub extends Operation {

    @Override
    public double getResult() {
        return getNumberA()-getNumberB();
    }
}
