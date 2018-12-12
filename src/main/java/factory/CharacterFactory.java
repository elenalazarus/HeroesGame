package factory;
import characters.Elf;
import characters.Hobbit;
import characters.King;
import characters.Knight;
import config.Config;
import characters.Character;
import lombok.SneakyThrows;

import java.util.HashMap;

public class CharacterFactory {
    public HashMap<Integer, Class<? extends Character>> hm;

    public CharacterFactory(){
        hm = new HashMap<>();
        hm.put(0, Hobbit.class);
        hm.put(1, Elf.class);
        hm.put(2, King.class);
        hm.put(3, Knight.class);

    }

    @SneakyThrows
    public Character createCharacter(){
        return hm.get(Config.random.nextInt(hm.size())).newInstance();
    }

}
