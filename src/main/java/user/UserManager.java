package user;

import menu.MenuChooser;
import model.Warrior;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private static List<User> userList;

    public static List<User> getUserList() {
        return new ArrayList<>(userList);
    }

    public static boolean addUser(User user) {
        if (userList == null) userList = new ArrayList<>();
        return userList.add(user);
    }

    public static void displayUserMenu() {
        Warrior warrior = getWarrior(UserType.USER);
        MenuChooser.displayMenu(warrior);
    }

    public static void displayCPUMenu() {
        Warrior warrior = getWarrior(UserType.CPU);
        MenuChooser.displayMenu(warrior);
    }

    public static Warrior getWarrior(UserType userType) {
        return getUser(userType).getDroidType();
    }

    public static void setUserTurn(UserType userType) {
        User user = getUser(userType);
        user.setTurn(true);
        getUserList().stream().filter(user1 -> !user1.equals(user)).forEach(user1 -> user1.setTurn(false));
    }

    public static User getUser(UserType userType) {
        User user = null;
        switch (userType) {
            case USER: {
                user = UserManager.getUserList().stream().filter(user1 -> !user1.getUserName().equals("CPU")).findFirst().get();
                break;
            }
            case CPU: {
                user = UserManager.getUserList().stream().filter(user1 -> user1.getUserName().equals("CPU")).findFirst().get();
                break;
            }
        }
        return user;
    }
}
