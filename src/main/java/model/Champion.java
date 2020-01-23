package model;

import util.ConsoleColors;

public class Champion extends Warrior {
    private boolean isFighted;

    public Champion(String name, int attak, int hitpoints) {
        super(name, attak, hitpoints);
    }

    public boolean isFighted() {
        return isFighted;
    }

    public void setFighted(boolean fighted) {
        isFighted = fighted;
    }

    public void fight(Warrior monster) {
        monster.setHealthPoints(monster.getHealthPoints() - getAttack());
        ConsoleColors.RED.print(String.format("You hit a MONSTER on %s points", getAttack()));
    }

    public void defence(Warrior monster) {
        if (isFighted()) {
            setHealthPoints(getHealthPoints() + monster.getAttack());
            setFighted(false);
            ConsoleColors.RED.print("Champion makes a block!");
        } else {
            ConsoleColors.RED.print("Cant do block anymore");
        }
    }

    public void rest() {
        setHealthPoints(getHealthPoints() + 5);
        ConsoleColors.RED.print("CHAMPION health at 5 points");
    }
}
