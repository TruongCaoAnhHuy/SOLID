package SimpleDuckApp.so3;

public class MallarDuck extends Duck {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm real a MALLARDUCK");
    }

    public MallarDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }    
}
