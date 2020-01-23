package command;

import user.User;
import user.UserManager;

public class CommandPicker {

    public static void getCommand(int choice) {
        User user =  UserManager.getUserList().stream().filter(User::isTurn).findFirst().get();
        CommandFactory factory = AbstractCommandFactory.getCommandFactory(user.getDroidType());
        factory.executeCommand(choice);
    }
}
