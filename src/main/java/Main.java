import command.CommandPicker;
import menu.StartMenu;
import scannerManager.ScannerManager;
import user.UserManager;
import user.UserType;

public class Main {
    public static void main(String[] args) {

        StartMenu.displayMenu();
        UserManager.getUserList().forEach(user -> System.out.println(user.getDroidType().toString()));
        while (UserManager.getUserList().stream().allMatch(user -> user.getDroidType().isAlive())) {
            UserManager.setUserTurn(UserType.USER);
            UserManager.displayUserMenu();
            int userChoice = ScannerManager.getScanner().nextInt();
            System.out.println("You entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
            UserManager.setUserTurn(UserType.CPU);
            UserManager.getUserList().forEach(user -> System.out.println(user.getDroidType().toString()));
            UserManager.displayCPUMenu();
            userChoice = ScannerManager.getScanner().nextInt();
            System.out.println("You entered - " + userChoice);
            CommandPicker.getCommand(userChoice);
            UserManager.getUserList().forEach(user -> System.out.println(user.getDroidType().toString()));
            //monster actions
            //champ actions
        }
    }
}
