package DesignPuzzleSolution;

public class TestDrive {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.performWeapon();

        System.out.println();

        Character queen = new Queen();
        queen.fight();
        queen.performWeapon();

        System.out.println();

        Character knight = new Knight();
        knight.fight();
        knight.performWeapon();

        System.out.println();

        Character troll = new Troll();
        troll.fight();
        troll.performWeapon();
        troll.setWeaponBehavior(new BowAndArrowBehavior());
        troll.performWeapon();

    }
}
