package characters;

import java.util.Random;

public class Knight extends SwordsMan {
    public Knight(){
        super(2, 12);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(c.getHp() - this.getPower());
        } else {
            this.setHp(this.getHp() - 1);
        }
    }
}
