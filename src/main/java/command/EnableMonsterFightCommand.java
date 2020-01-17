package command;

import model.Monster;
import model.Warrior;
import user.UserManager;
import user.UserType;

public class EnableMonsterFightCommand implements Command {
    private Warrior userHero;
    private Warrior cpuHero;

    @Override
    public void execute() {
        userHero = UserManager.getWarrior(UserType.USER);
        cpuHero = UserManager.getWarrior(UserType.CPU);
        if (UserManager.getUser(UserType.USER).isTurn() && userHero instanceof Monster) {
            ((Monster) userHero).enrage();
        } else if (cpuHero instanceof Monster) {
            ((Monster) userHero).enrage();
        }
    }
}
