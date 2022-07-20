package SimpleDuckApp.so3;

public class ModelDuck extends Duck{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("I'm a MODELDUCK");
    }

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    
}
