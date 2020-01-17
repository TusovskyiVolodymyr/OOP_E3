package command;

import model.Champion;
import model.Monster;
import model.Warrior;
import user.UserManager;
import user.UserType;

public class RestCommand implements Command {
    private Warrior userHero;
    private Warrior cpuHero;

    @Override
    public void execute() {
        userHero = UserManager.getWarrior(UserType.USER);
        cpuHero = UserManager.getWarrior(UserType.CPU);
        if (UserManager.getUser(UserType.USER).isTurn() && userHero instanceof Champion) {
            ((Champion) userHero).rest();
        } else if (cpuHero instanceof Champion) {
            ((Champion) userHero).rest();
        }
    }
}
