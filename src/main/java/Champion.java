public class Champion extends Warrior {
    private int fightIsOn = 1;

    public Champion(String name, int attak, int hitpoints) {
        super(name, attak, hitpoints);
    }

    public void fight(Warrior monster) {
        monster.setHitpoints(monster.getHitpoints() - monster.getAttak());
    }

    public int defence(Monster monster) {
        if (fightIsOn > 0 && fightIsOn < 2) {
            setHitpoints(getHitpoints() + monster.getAttak());
            fightIsOn++;
            System.out.println("Champion makes a block!");

        } else {
            System.out.println("Cant do block anymore");

        }
        return fightIsOn = 1;
    }

    public void rest() {
        setHitpoints(getHitpoints() + 5);
    }
}
