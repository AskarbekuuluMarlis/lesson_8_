package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Medic extends Hero {
    int healPoints;

    public Medic(int health, int damage, String name) {
        super(health, damage, SuperAbility.HEAL, name);
    }


    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        healPoints = 15;

        if (this.getHealth() > 0 ) {
            for (int i = 0; i < heroes.length; i++) {
                if (heroes[i].getHealth() <= 100) {
                    heroes[i].setHealth(heroes[i].getHealth() + 5);
                    System.out.println("Health: " + heroes[i].getName() + healPoints);
                    break;
                }

            }
        }
    }
}
