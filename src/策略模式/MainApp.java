package 策略模式;

public class MainApp {
    public static void main(String[] args) {
        Context context;

        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
    }
}
