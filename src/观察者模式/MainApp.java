package 观察者模式;

public class MainApp {

    public static void main(String[] args) {
        Secretary se = new Secretary();
        ConcreteObserverA ca = new ConcreteObserverA("Kim",se);
        se.Attach(ca);
        se.setState("lololo");
        se.Notify();
    }
}
