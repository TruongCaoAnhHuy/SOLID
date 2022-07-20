package DesignPuzzleSolution;

public class Queen extends Character {

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        System.out.println("I'm a QUEEN");
    }

    public Queen(){
        weaponBehavior = new BowAndArrowBehavior();
    }
    
}
