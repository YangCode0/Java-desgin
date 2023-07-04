package observe;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {

    private List<Observer> weixinUser = new ArrayList<Observer>();

    @Override
    public void attach(Observer observer) {
        weixinUser.add(observer);

    }

    @Override
    public void detach(Observer observer) {
        weixinUser.remove(observer);

    }

    @Override
    public void notify(String message) {
        for (Observer observer : weixinUser) {
            observer.update(message);
        }

    }
}
