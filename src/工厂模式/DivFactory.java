package 工厂模式;

public class DivFactory implements IFactory{

    @Override
    public Operation createOperation() {
        return new OperationDiv();
    }
}
