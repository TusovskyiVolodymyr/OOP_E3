package randomizer;

import com.sun.org.apache.regexp.internal.RE;
import model.Champion;
import model.Monster;
import model.Warrior;
import user.User;
import user.UserManager;
import user.UserType;

import java.util.HashSet;
import java.util.Set;

public class Random {
    public static int getRandomInt() {
        java.util.Random random = new java.util.Random();
        Warrior warrior = UserManager.getWarrior(UserType.CPU);
        if (warrior instanceof Champion) {
            return random.ints(1, 3).findFirst().getAsInt();
        } else if(warrior instanceof Monster) {
            return random.ints(1, 3).findFirst().getAsInt();
        }
        return 0;
    }
}
