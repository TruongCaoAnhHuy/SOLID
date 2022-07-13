package SimpleDuckApp.so2;

public class MallarDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I am a real MALLARDUCK");
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("Cạp...Cạp...Cạp");
    }

    @Override
    public void fly() {
        // TODO Auto-generated method stub
        System.out.println("Flying...");
    }
    
}
