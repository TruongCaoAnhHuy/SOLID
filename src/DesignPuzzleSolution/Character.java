package DesignPuzzleSolution;

public abstract class Character {
    public Character(){}

    WeaponBehavior weaponBehavior;

    SwordBehavior swordBehavior;
    BowAndArrowBehavior bowAndArrowBehavior;
    KnifeBehavior knifeBehavior;
    AxeBehavior axeBehavior;

    public void setSwordBehavior(SwordBehavior swordBehavior) {
        this.swordBehavior = swordBehavior;
    }

    public void setBowAndArrowBehavior(BowAndArrowBehavior bowAndArrowBehavior) {
        this.bowAndArrowBehavior = bowAndArrowBehavior;
    }

    public void setKnifeBehavior(KnifeBehavior knifeBehavior) {
        this.knifeBehavior = knifeBehavior;
    }
    
    public void setAxeBehavior(AxeBehavior axeBehavior) {
        this.axeBehavior = axeBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    public void performWeapon(){
        weaponBehavior.useWeapon();
    }

    public abstract void fight();
    
}
