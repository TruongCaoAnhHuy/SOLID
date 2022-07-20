package SimpleDuckApp.so3;

public class RubberDuck extends Duck {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("RUBBERDUCK");
    }

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }  
}
