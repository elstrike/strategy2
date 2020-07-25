package strategy2;

public class Main {
    public static void main(String[] args) {
        GameCharacter character = new GameCharacter();

        character.doAttack();

        character.setWeapon(new Knife());
        character.doAttack();

        character.setWeapon(new Sword());
        character.doAttack();

        character.setWeapon(new Axe());
        character.doAttack();
    }
}
