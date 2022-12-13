package 观察者模式;

public class ConcreteObserverA extends Observer{

    public ConcreteObserverA(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println("ConcreteObserverA update"+sub.getState());
    }
}
