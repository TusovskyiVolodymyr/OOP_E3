package menu;

import menu.Menu;

public class MonsterMenu implements Menu {
    public void displayMenu() {
        System.out.println("Action items for MONSTER personage:");
        System.out.println("1 - attack the opponent");
        System.out.println("2 - make a MONSTER attack (your attack points will be increased at x2)");
        System.out.println("3 - heal (will add +5 HP to your health)");
    }
}
