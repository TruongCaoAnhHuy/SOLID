package SimpleDuckApp.so3;

/**
 * Code cứng, khó tái sử dụng
 */

public class TestDrive {
    public static void main(String[] args) {
        Duck mallarDuck = new MallarDuck();
        mallarDuck.display();
        mallarDuck.performFly();
        mallarDuck.performQuack();

        System.out.println();

        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.display();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        System.out.println();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();

        System.out.println();

        Duck decoyDuck = new DecoyDuck();
        decoyDuck.display();
        decoyDuck.performFly();
        decoyDuck.performQuack();

        System.out.println();

        // ModelDuck modelDuck = new ModelDuck();
        // modelDuck.display();
        // modelDuck.performFly();
        // modelDuck.performQuack();

        Duck model = new ModelDuck();
        model.display();
        model.performFly();
        model.performQuack();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
        
    }
}
