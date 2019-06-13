import Boat.*;
import Animals.*;

import java.util.Scanner;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        boolean test = true;
        Scanner reader = new Scanner(System.in);
        Feline lion = new Feline(1.2, "lion");
        Ruminantia cow = new Ruminantia(2, "cow");
        Ruminantia cow1 = new Ruminantia(1, "cow");
        Ape bonobo = new Ape(0.8,"bonobo");
        Crocodilians alligator = new Crocodilians(7,"alligator");
        Crocodilians alligator1 = new Crocodilians(3,"alligator");
        Serpentes anaconda = new Serpentes(6,"anaconda");
        Serpentes grass_snake= new Serpentes(1.2,"grass-snake");
        Serpentes viper = new Serpentes(2.5,"viper");
        Raptor vulture = new Raptor(2,"vulture");
        Raptor vulture1 = new Raptor(0.9,"vulture");
        Raptor eagle = new Raptor(1.5, "eagle");
        Granivorous raven = new Granivorous(1.1, "raven");
        Granivorous pigeon = new Granivorous(1.1, "pigeon");
        Feline cerval = new Feline(0.8,"cerval");
        System.out.println("Do you want the tests ? [Y/N]");
        Vector<Animal> animalList = new Vector<>();
        animalList.add(lion);
        animalList.add(cow);
        animalList.add(cow1);
        animalList.add(bonobo);
        animalList.add(alligator);
        animalList.add(alligator1);
        animalList.add(anaconda);
        animalList.add(grass_snake);
        animalList.add(viper);
        animalList.add(vulture);
        animalList.add(vulture1);
        animalList.add(eagle);
        animalList.add(raven);
        animalList.add(pigeon);
        animalList.add(cerval);
        if (reader.next() == "Y")
            test = true;
        if (test) {
            lion.hunt();
            cow.runFrom(lion);
            cow1.runFrom(lion);
            lion.eat(cow);
            lion.eat(cow1);
            bonobo.eat();
            bonobo.eat(cow);
            bonobo.eat(alligator);
            System.out.println(lion.isCarnivorous());
            System.out.println(cow.isCarnivorous());
            raven.fly();
            anaconda.eat(cow1);
            vulture.eat(pigeon);
            pigeon.runFrom(vulture1);
        }
        System.out.println("Create a new boat with how many decks ?");
        int nbOfDecks = reader.nextInt();
        Boat ark = new Boat(nbOfDecks);
        ark.create();
        System.out.println(ark.getBoatOccupancy());
        System.out.println(ark.getDeckList());
        for (Deck d: ark.getDeckList()) {
            System.out.println(d.getRoomList());
        }
        ark.fill(animalList);
        System.out.println();
        System.out.println("ark filled");
    }
}
