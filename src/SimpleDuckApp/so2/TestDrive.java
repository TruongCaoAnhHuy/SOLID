package SimpleDuckApp.so2;

public class TestDrive {
    public static void main(String[] args) {
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.fly();
        mallarDuck.quack();

        System.out.println();
        
        RedheadDuck redheadDuck =new RedheadDuck();
        redheadDuck.display();
        redheadDuck.fly();
        redheadDuck.quack();

        System.out.println();

        RubberDuck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.quack();

        System.out.println();

        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.display();

    }
}
