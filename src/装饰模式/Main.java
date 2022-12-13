package 装饰模式;

public class Main {
    public static void main(String[] args) {
        Component c = new ConcreteComponent();
        Decorator d1 = new ConcreteDecoratorA(c);
        Decorator d2 = new ConcreteDecoratorB(c);

        d1.Operation();
        d2.Operation();
    }
}
