package menu;

public class ChampionMenu implements Menu {
    public void displayMenu() {
        System.out.println("Action items for CHAMPION personage:");
        System.out.println("1 - attack the opponent");
        System.out.println("2 - make a block (will reflect any attack)");
        System.out.println("3 - heal (will add +7 HP to your health)");
    }
}
