package ZAD1;

public abstract class Character {
    WeaponBehaviour weaponBehaviour;

    public Character(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }

    public void Attack(){
        weaponBehaviour.useWeapon();
    }

    public void setWeaponBehaviour(WeaponBehaviour weaponBehaviour) {
        this.weaponBehaviour = weaponBehaviour;
    }
}
