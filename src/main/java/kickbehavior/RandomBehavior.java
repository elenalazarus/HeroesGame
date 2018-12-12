package kickbehavior;

import characters.Character;
import config.Config;

public class RandomBehavior implements Behavior {
    public void kick(Character main, Character enemy) {
        enemy.setHp(enemy.getHp() - Config.random.nextInt(main.getPower() + 1));
    }
}
