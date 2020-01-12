public abstract class Warrior implements Fightable {
    private String name;
    private int attak;
    private int hitpoints;
    private boolean isBlock;

    public Warrior(String name, int attak, int hitpoints) {
        this.name = name;
        this.attak = attak;
        this.hitpoints = hitpoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttak() {
        return attak;
    }

    public void setAttak(int attak) {
        this.attak = attak;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public boolean isAlive() {
        return getHitpoints() > 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", hitpoints=" + hitpoints +
                '}';
    }
}
