package SimpleDuckApp.so3;

public class DecoyDuck extends Duck {

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("DECOYDUCK");
    }

    public DecoyDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
    
}
