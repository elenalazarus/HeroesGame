package kickbehavior;

import characters.Character;

public class GodBehavior implements Behavior{
    public void kick(Character main, Character enemy) {
        enemy.setHp(0);
    }
}
