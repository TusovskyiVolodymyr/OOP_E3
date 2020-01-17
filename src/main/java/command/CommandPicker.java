package command;

public class CommandPicker {

    private static Command command;

    public static void getCommand(int choice) {
        switch (choice) {
            case 1: {
                command = new FightCommand();
                break;
            }
            case 2: {
                command = new DefenceCommand();
                break;
            }
            case 3: {
                command = new EnableMonsterFightCommand();
                break;
            }
            case 4: {
                command = new RestCommand();
                break;
            }
        }
        command.execute();
        System.out.println("Command executed" + command.getClass().getSimpleName());
    }
}
