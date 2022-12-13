package 装饰模式;

public class ConcreteDecoratorA extends Decorator{
    private String addedState;

    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void Operation() {
        super.Operation();
        addedState = "New State";
        System.out.println("具体装饰对象A的操作");
    }
}
