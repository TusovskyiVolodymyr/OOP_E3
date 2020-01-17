package menu;

import model.Champion;
import model.Monster;
import model.Warrior;

public class MenuChooser {
    private static Menu menu;

    public static void displayMenu(Warrior warrior) {
        if (warrior instanceof Champion) {
            menu = new ChampionMenu();
        } else if (warrior instanceof Monster) {
            menu = new MonsterMenu();
        }
        menu.displayMenu();
    }
}
