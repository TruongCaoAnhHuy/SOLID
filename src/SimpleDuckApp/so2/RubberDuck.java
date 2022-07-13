package SimpleDuckApp.so2;

public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
        // TODO Auto-generated method stub
        System.out.println("RUBBERDUCK");
    }

    @Override
    public void quack() {
        // TODO Auto-generated method stub
        System.out.println("Bíp...Bíp...Bíp");
    }    
}
