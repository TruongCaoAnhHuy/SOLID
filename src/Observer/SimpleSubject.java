package Observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleSubject implements Subject {

    private List<Observer> observers;
    
    public SimpleSubject(){
        observers = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.add(o);
    }
    @Override
    public void removeObserver(Observer o) {
        // TODO Auto-generated method stub
        observers.remove(o);
    }
    @Override
    public void notifyObserver() {
        // TODO Auto-generated method stub
        for (Observer observer : observers) {
            observer.update(value);
        }
    }

    int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
        notifyObserver();
    }  
}
