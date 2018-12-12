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

        System.out.printf("\nThe %s was created as hero 2 \n", hero2.getClass().getSimpleName());
        System.out.printf("Power: %d    Health: %d \n\n", hero2.getPower(), hero2.getHp());

    }

    public void fight(){
        while (hero.isAlive() && hero2.isAlive()) {
            hero.kick(hero2);
            System.out.printf("Hero 1 {%s} kicked hero 2 {%s} \n", hero.getClass().getSimpleName(), hero2.getClass().getSimpleName());
            System.out.println();
            System.out.printf("Hero 1 {%s}: Power: %d    Health: %d \n", hero.getClass().getSimpleName(), hero.getPower(), hero.getHp());
            System.out.printf("Hero 2 {%s}: Power: %d    Health: %d \n", hero2.getClass().getSimpleName(), hero2.getPower(), hero2.getHp());
            if (hero.isAlive() && hero2.isAlive()) {
                hero2.kick(hero);
                System.out.println();
                System.out.printf("Hero 2 {%s} kicked hero 1 {%s} \n", hero2.getClass().getSimpleName(), hero.getClass().getSimpleName());
                System.out.println();
                System.out.printf("Hero 1 {%s}: Power: %d    Health: %d \n", hero.getClass().getSimpleName(), hero.getPower(), hero.getHp());
                System.out.printf("Hero 2 {%s} kicked hero 1 {%s} \n", hero2.getClass().getSimpleName(), hero2.getPower(), hero2.getHp());

            }

        }
        System.out.println();
        if (hero.isAlive()) {
            System.out.printf("Hero 1 {%s} is a winner \n", hero.getClass().getSimpleName());
        }
        else if (hero2.isAlive()){
            System.out.printf("Hero 2 {%s} is a winner \n", hero2.getClass().getSimpleName());
        }

    }
}

