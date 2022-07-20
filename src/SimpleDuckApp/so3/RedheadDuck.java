package SimpleDuckApp.so3;

public class RedheadDuck extends Duck{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I am a real REDHEADDUCK");
    }

    public RedheadDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
}
