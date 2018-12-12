package characters;

public class Elf extends Character {
    public Elf() {
        super(10, 10);
    }

    public void kick(Character c) {
        if (c.getPower() < this.getPower()) {
            System.out.println("Elf killed character");
            c.setHp(c.getHp() - this.getPower());
        } else {
            this.setHp(this.getHp() - c.getPower());
        }
    }

}
