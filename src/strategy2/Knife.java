package strategy2;

import strategy2.Weapon;

public class Knife implements Weapon {
    @Override
    public int doAttack() {
        System.out.println("칼 공격");
        return 0;
    }
}
