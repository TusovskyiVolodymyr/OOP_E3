package scenario;

import command.CommandPicker;
import menu.StartMenu;
import randomizer.Random;
import scannerManager.ScannerManager;
import user.User;
import user.UserManager;
import user.UserType;
import util.ConsoleColors;

public class GameScenario {
    public void playScenario() {
        new StartMenu().displayMenu();
        ConsoleColors.YELLOW.print("Current status: ");
        UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
        while (UserManager.isAllUsersAlive()) {
            System.out.println("=================================================================================");
            UserManager.setUserTurn(UserType.USER);
            ConsoleColors.PURPLE.print("Now is turn of " + UserManager.getUser(UserType.USER).getUserName());
            UserManager.displayUserMenu();
            int userChoice = ScannerManager.getScanner().nextInt();
            ConsoleColors.CYAN.print("You entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
            System.out.println("=================================================================================");
            if (!UserManager.isAllUsersAlive()) {
                User winner = UserManager.getUserList().stream().filter(user -> user.getDroidType().isAlive()).findFirst().get();
                ConsoleColors.CYAN.print(String.format("The Winner is - %s with his %s", winner.getUserName(), winner.getDroidType().getName()));
                break;
            }
            System.out.println("=================================================================================");
            UserManager.setUserTurn(UserType.CPU);
            ConsoleColors.PURPLE.print("Now is turn of " + UserManager.getUser(UserType.CPU).getUserName());
            ConsoleColors.YELLOW.print("Current status: ");
            UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
            UserManager.displayCPUMenu();
            userChoice = Random.getRandomInt();
            ConsoleColors.CYAN.print("CPU entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
            System.out.println("=================================================================================");
            ConsoleColors.YELLOW.print("Current status: ");
            UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
            if (!UserManager.isAllUsersAlive()) {
                User winner = UserManager.getUserList().stream().filter(user -> user.getDroidType().isAlive()).findFirst().get();
                ConsoleColors.CYAN.print(String.format("The Winner is - %s with his %s", winner.getUserName(), winner.getDroidType().getName()));
                break;
            }
        }
    }
}
