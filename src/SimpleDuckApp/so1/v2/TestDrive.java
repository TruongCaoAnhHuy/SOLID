package SimpleDuckApp.so1.v2;

public class TestDrive {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.swim();
        mallarDuck.quack();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
    }
}
