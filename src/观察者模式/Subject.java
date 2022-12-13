package 观察者模式;

public interface Subject {
    void Attach(Observer observer);
    void Detach(Observer observer);
    void Notify();
    String getState();
    void setState(String state);
}
