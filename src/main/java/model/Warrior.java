package model;

import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return attak == warrior.attak &&
                hitpoints == warrior.hitpoints &&
                name.equals(warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attak, hitpoints);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", attak=" + attak +
                ", hitpoints=" + hitpoints +
                '}';
    }
}
