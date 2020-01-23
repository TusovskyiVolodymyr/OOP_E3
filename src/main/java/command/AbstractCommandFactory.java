package command;

import model.Champion;
import model.Monster;
import model.Warrior;

public class AbstractCommandFactory {

    public static CommandFactory getCommandFactory(Warrior warriorType) {
        CommandFactory factory = null;
        if (warriorType instanceof Champion) {
            factory = new ChampionCommand();
        } else if (warriorType instanceof Monster) {
            factory = new MonsterCommand();
        }
        return factory;
    }
}
