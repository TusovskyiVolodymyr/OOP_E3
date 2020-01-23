import command.CommandPicker;
import menu.StartMenu;
import randomizer.Random;
import scannerManager.ScannerManager;
import user.UserManager;
import user.UserType;
import util.ConsoleColors;

public class Main {
    public static void main(String[] args) {
        new StartMenu().displayMenu();
        ConsoleColors.YELLOW.print("Current status: ");
        UserManager.getUserList().forEach(user -> ConsoleColors.YELLOW.print(user.getDroidType().toString()));
        while (UserManager.getUserList().stream().allMatch(user -> user.getDroidType().isAlive())) {
            UserManager.setUserTurn(UserType.USER);
            ConsoleColors.PURPLE.print("Now is turn of " + UserManager.getUser(UserType.USER).getUserName());
            UserManager.displayUserMenu();
            int userChoice = ScannerManager.getScanner().nextInt();
            ConsoleColors.CYAN.print("You entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
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
        }
    }
}
