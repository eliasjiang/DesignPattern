package 装饰模式;

public class ConcreteDecoratorB extends Decorator{


    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void Operation() {
        super.Operation();
        AddedBehavior();
        System.out.println("具体装饰对象B的操作");
    }

    private void AddedBehavior(){
        System.out.println("Show Show way");
    }
}
