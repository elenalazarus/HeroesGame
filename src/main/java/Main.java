import game.GameManager;
import org.fluttercode.datafactory.impl.DataFactory;
import org.reflections.Reflections;

import java.io.IOException;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Reflections reflections = new Reflections("characters");
        Set<Class<? extends Character>> subTypes = reflections.getSubTypesOf(Character.class);

        DataFactory df = new DataFactory();
        GameManager game = new GameManager();
        game.createFactory();
        game.fight();


    }
}
