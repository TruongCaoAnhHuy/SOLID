package DesignPuzzleSolution;

public class Troll extends Character {

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        System.out.println("I'm a TROLL");
    }

    public Troll(){
        weaponBehavior = new KnifeBehavior();
    }
    
}
