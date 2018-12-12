package characters;

public class Hobbit extends Character{
    public Hobbit() {
        super(0, 3);
    }

    public void kick(Character c) {
        toCry();
        this.setHp(0);
    }

    private void toCry(){
        System.out.println("Cry, cry, cry");
    }
}
