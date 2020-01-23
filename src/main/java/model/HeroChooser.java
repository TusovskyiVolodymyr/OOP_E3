package model;

public class HeroChooser {

    public static Warrior getHero(int userPref) {
        Warrior warrior = null;
        switch (userPref) {
            case 1: {
                warrior = new Champion("champion", 10, 100);
                break;
            }
            case 2: {
                warrior = new Monster("monster", 12, 100);
                break;
            }
        }
        return warrior;
    }
}
