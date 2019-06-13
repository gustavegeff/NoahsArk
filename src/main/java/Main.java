import Boat.*;
import Animals.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner reader = new Scanner(System.in);
        System.out.println("Create a new boat with how many decks ?");
        int nbOfDecks = reader.nextInt();
        Boat ark = new Boat(nbOfDecks);
        ark.create();
        System.out.println(ark.getBoatOccupancy());
        System.out.println(ark.getDeckList());
        for (Deck d: ark.getDeckList()) {
            System.out.println(d.getRoomList());
        }*/
        Feline lion = new Feline(1.2, "lion");
        lion.hunt();
        Ruminantia cow = new Ruminantia(2,"cow");
        cow.runFrom(lion);
        lion.eat(cow);
        System.out.println(lion.isCarnivorous());
        System.out.println(cow.isCarnivorous());

        //ark.fill();
    }
}
