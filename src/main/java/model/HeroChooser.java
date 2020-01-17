package model;

public class HeroChooser {

    public static Warrior getHero(int userPref) {
        switch (userPref) {
            case 1: {
                return new Champion("champion", 10, 100);
            }
            case 2: {
                return new Monster("monster", 12, 100);
            }
        }

        return null;
    }
 }
