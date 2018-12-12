package game;

import characters.Character;
import factory.CharacterFactory;

public class GameManager {
    private Character hero;
    private Character hero2;


    public void createFactory(){
        CharacterFactory factory = new CharacterFactory();
        hero = factory.createCharacter();
        hero2 = factory.createCharacter();

        System.out.println("\n Hello! Let's start our game! \n");

        System.out.printf("The %s was created as hero 1 \n", hero.getClass().getSimpleName());
        System.out.printf("Power: %d    Health: %d \n", hero.getPower(), hero.getHp());

        System.out.printf("\n The %s was created as hero 2 \n", hero2.getClass().getSimpleName());
        System.out.printf("Power: %d    Health: %d \n\n", hero2.getPower(), hero2.getHp());

        fight();
    }

    public void fight(){
        while (hero.isAlive() && hero2.isAlive()){
            hero.kick(hero2);
        }
    }
}

