package randomizer;

import model.Champion;
import model.Monster;
import model.Warrior;
import user.UserManager;
import user.UserType;

public class Random {
    public static int getRandomInt() {
        java.util.Random random = new java.util.Random();
        Warrior warrior = UserManager.getWarrior(UserType.CPU);
        if (warrior instanceof Champion) {
            return random.ints(1, 4).findFirst().getAsInt();
        } else if (warrior instanceof Monster) {
            return random.ints(1, 4).findFirst().getAsInt();
        }
        return 0;
    }
}
