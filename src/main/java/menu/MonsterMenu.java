package menu;

import menu.Menu;

public class MonsterMenu implements Menu {
    public void displayMenu() {
        System.out.println("Action items for your personage:");
        System.out.println("1 - attack the opponent");
        System.out.println("2 - make a MONSTER attack (your attack points will be increased at x2)");
    }
}
