package model;

import util.ConsoleColors;

public class Monster extends Warrior {
    int movesCount;
    private boolean isEnabledSuperPower;

    public Monster(String name, int attak, int hitpoints) {
        super(name, attak, hitpoints);
    }

    public void fight(Warrior champion) {
        if (movesCount > 2 && isEnabledSuperPower) {
            setAttack(getAttack() / 2);
            isEnabledSuperPower = false;
        }
        champion.setHealthPoints(champion.getHealthPoints() - getAttack());
        ((Champion) champion).setFighted(true);
        movesCount++;
        ConsoleColors.RED.print(String.format("You hit a CHAMPION on %s points", getAttack()));
    }

    public void enrage() {
        if (!isEnabledSuperPower) {
            setAttack(getAttack() * 2);
            ConsoleColors.RED.print("Your attack is increased at x2 times");
            movesCount = 0;
            isEnabledSuperPower = true;
        } else {
            ConsoleColors.RED.print("The super attack is already on!");
        }
    }

    @Override
    public void heal() {
        setHealthPoints(getHealthPoints() + 5);
        ConsoleColors.RED.print("Monster health at 5 points");
    }
}
