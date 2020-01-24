package command;

import model.Warrior;
import user.UserManager;
import user.UserType;

public class HealCommand implements Command {
    private Warrior userHero;
    private Warrior cpuHero;

    @Override
    public void execute() {
        userHero = UserManager.getWarrior(UserType.USER);
        cpuHero = UserManager.getWarrior(UserType.CPU);
        if (UserManager.getUser(UserType.USER).isTurn()) {
            userHero.heal();
        } else if (UserManager.getUser(UserType.CPU).isTurn()) {
            cpuHero.heal();
        }
    }
}
