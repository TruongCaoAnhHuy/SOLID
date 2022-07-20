package SimpleDuckApp.so3;

public abstract class Duck {

    public Duck(){}

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public void swim(){
        System.out.println("Swimming...");

    }
    public abstract void display();

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }
}
