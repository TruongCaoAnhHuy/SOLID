package Observer;

public class SimpleObserver implements Observer{

    private int value;
    private Subject simpleSubject;

    public SimpleObserver (Subject simpleSubject){
        this.simpleSubject = simpleSubject;
        simpleSubject.registerObserver(this);
    }

    @Override
    public void update(int value) {
        // TODO Auto-generated method stub
        this.value = value;
        display();
    }

    @Override
    public void display() {
        System.out.println("Value: " + value);
    }
    
}
