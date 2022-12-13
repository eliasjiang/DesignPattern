package 观察者模式;

import java.util.ArrayList;

public class Secretary implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private String state;

    @Override
    public void Attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void Detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void Notify() {
        for (Observer o:observers
             ) {
            o.update();
        }
    }

    @Override
    public String getState() {
        return state;
    }

    @Override
    public void setState(String state) {
        this.state = state;
    }


}
