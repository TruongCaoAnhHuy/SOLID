package DesignPuzzleSolution;

public class King extends Character{

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        System.out.println("I'm a KING");
    }
    
    public King(){
        weaponBehavior = new AxeBehavior();
    }
}
