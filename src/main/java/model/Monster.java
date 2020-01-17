package model;

import model.Warrior;

public class Monster extends Warrior {
    int superPower;
    int isErange = 0;

    public Monster(String name, int attak, int hitpoints) {
        super(name, attak, hitpoints);
    }

    public void fight(Warrior champion) {
        champion.setHitpoints(champion.getHitpoints() - getAttak());
        superPower++;
        if (champion.getHitpoints() == 0) {
            System.out.println("Game over!");
        }
        if (superPower == 2 && isErange == 1) {
            setAttak(getAttak() / 2);
        }
    }

    public int enrage() {
        setAttak(getAttak() * 2);
        System.out.println("Combo x2 attack!");
        isErange++;
        return superPower = 0;
    }
}
