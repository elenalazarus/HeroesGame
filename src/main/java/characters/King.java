package characters;

import java.util.Random;

public class King extends SwordsMan{
    public King(){
        super(5, 15);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            System.out.println("King kicked character");
            c.setHp(c.getHp() - this.getPower());
        } else {
            this.setHp(this.getHp() - 1);
        }
    }

}
