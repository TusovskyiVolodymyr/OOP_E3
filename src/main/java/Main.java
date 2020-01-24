import command.CommandPicker;
import menu.StartMenu;
import randomizer.Random;
import scannerManager.ScannerManager;
import user.User;
import user.UserManager;
import user.UserType;
import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        new StartMenu().displayMenu();
        ConsoleColors.YELLOW.print("Current status: ");
        UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
        while (UserManager.isAllUsersAlive()) {
            UserManager.setUserTurn(UserType.USER);
            ConsoleColors.PURPLE.print("Now is turn of " + UserManager.getUser(UserType.USER).getUserName());
            UserManager.displayUserMenu();
            int userChoice = ScannerManager.getScanner().nextInt();
            ConsoleColors.CYAN.print("You entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
            if (!UserManager.isAllUsersAlive()) {
                User winner = UserManager.getUserList().stream().filter(user -> user.getDroidType().isAlive()).findFirst().get();
                ConsoleColors.CYAN.print(String.format("The Winner is - %s with his %s", winner.getUserName(), winner.getDroidType().getName()));
                break;
            }
            UserManager.setUserTurn(UserType.CPU);
            ConsoleColors.PURPLE.print("Now is turn of " + UserManager.getUser(UserType.CPU).getUserName());
            ConsoleColors.YELLOW.print("Current status: ");
            UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
            UserManager.displayCPUMenu();
            userChoice = Random.getRandomInt();
            ConsoleColors.CYAN.print("CPU entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
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
