package command;

public class MonsterCommand extends CommandFactory {

    public void executeCommand(int userChoice) {
        Command command = null;
        switch (userChoice) {
            case 1: {
                command = new FightCommand();
                break;
            }
            case 2: {
                command = new EnableMonsterFightCommand();
                break;
            }
            case 3: {
                command = new HealCommand();
                break;
            }
        }
        command.execute();
        System.out.println("Command executed: " + command.getClass().getSimpleName());
    }
}
