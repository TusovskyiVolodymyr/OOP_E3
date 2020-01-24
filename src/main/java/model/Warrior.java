package model;

import java.util.Objects;

public abstract class Warrior implements Fightable, Healable {
    private String name;
    private int attack;
    private int healthPoints;

    public Warrior(String name, int attack, int healthPoints) {
        this.name = name;
        this.attack = attack;
        this.healthPoints = healthPoints;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if (attack > 0) {
            this.attack = attack;
        }
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public boolean isAlive() {
        return getHealthPoints() > 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Warrior warrior = (Warrior) o;
        return attack == warrior.attack &&
                healthPoints == warrior.healthPoints &&
                name.equals(warrior.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, attack, healthPoints);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", attak=" + attack +
                ", hitpoints=" + healthPoints +
                '}';
    }
}
