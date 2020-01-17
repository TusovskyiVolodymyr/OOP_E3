package menu;

import model.HeroChooser;
import model.Warrior;
import scannerManager.ScannerManager;
import user.User;
import user.UserManager;

public class StartMenu {

    public static void displayMenu() {
        System.out.println("Hello, please type your name: ");
        String userName = ScannerManager.getScanner().nextLine();
        System.out.println("Welcome, " + userName);
        System.out.println("Great! Now pick up your hero!");
        System.out.println("1 - for Champion\n2 - for Monster");
        int heroType = ScannerManager.getScanner().nextInt();
        Warrior father = HeroChooser.getHero(heroType);
        UserManager.addUser(new User(userName, father));
        System.out.println(String.format("Congrats, %s you with your are ready for battle !", userName));
        int cpuHero = heroType == 1 ? 2 : 1;
        Warrior warrior = HeroChooser.getHero(cpuHero);
        UserManager.addUser(new User("CPU", warrior));
    }
}
