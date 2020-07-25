package strategy2;

import strategy2.Weapon;

public class GameCharacter {
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        System.out.println(weapon);
        this.weapon = weapon;
    }

    public int doAttack() {
        if (weapon == null) {
            System.out.println("맨손 공격");
            return 1;
        } else {
            System.out.println("1");
            return weapon.doAttack();
        }
    }
}
