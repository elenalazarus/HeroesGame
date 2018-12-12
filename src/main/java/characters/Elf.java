package characters;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            c.setHp(0);
        } else {
            this.setHp(this.getHp() - 1);
        }
    }

}
