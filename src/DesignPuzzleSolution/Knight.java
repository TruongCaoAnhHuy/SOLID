package DesignPuzzleSolution;

public class Knight extends Character {

    @Override
    public void fight() {
        // TODO Auto-generated method stub
        System.out.println("I'm a KINGHT");
    }

    public Knight(){
        weaponBehavior = new SwordBehavior();
    }
    
}
