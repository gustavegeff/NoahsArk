package Boat;

import Tool.Tool;
import Animals.*;

import java.util.Scanner;
import java.util.Vector;

public class Boat {
    private Vector<Deck> deckList;
    private int nbOfDecks;

    public Boat(int nbOfDecks) {
        this.nbOfDecks = nbOfDecks;
        deckList = new Vector<>();
    }

    public void create()
    {
        Tool tool = new Tool();
        Scanner reader = new Scanner(System.in);
        for (int i = 0;  i < nbOfDecks; i++)
        {
            System.out.println("How much can the deck " + (i+1) + " support ?");
            int maxWeight = reader.nextInt();
            Deck deck = new Deck(maxWeight);
            System.out.println("How many rooms in the deck " + (i+1) + "?");
            int nbOfRooms = reader.nextInt();
            for (int j = 0; j < nbOfRooms; j++)
            {
                Room room = new Room(tool.randomRange(1,10),tool.randomRange(maxWeight/10,maxWeight/2));
                deck.getRoomList().add(room);
            }
            deckList.add(deck);
        }
    }

    public int getBoatOccupancy()
    {
        int tot = 0;
        int top = 0;
        for (Deck d: deckList) {
            tot += d.getDeckOccupancy();
            top += 100;
        }
        return tot / top * 100;
    }


    public void fill(Vector<Animal> animalList) {
        double average = computeAverageWeight(animalList);

        for (Animal a : animalList)
        {
            Room r = findBestRoom(a);
            placeInRoom(a,r);
        }
    }
    double computeAverageWeight(Vector<Animal> animalList){
        double totWeight = 0;
        int count = 0;
        for (Animal a : animalList)
        {
            totWeight += a.getWeight();
            count++;
        }
        if (count == 0)
            return 0;
        return totWeight/count;
    }

    private Room findBestRoom(Animal a)
    {
        //return the room who fits best for the animal
        //traverse all the boat and stop when a room as a size just bigger or fits or is bigger than twice the average
        //size if there is not incompatibility (predators, prey...)

        for (Deck d : this.deckList)
        {
            if (d.getDeckOccupancy() == 100)
                continue;
            for (Room r : d.getRoomList()){
                if (r.getRoomFillingPercentage() == 100)
                    continue;
                if (r.isRoomSuitable(a))
                    return r;
            }
        }
        return null;
    }

    boolean placeInRoom(Animal a, Room r){
        return false;
    }


    public Vector<Deck> getDeckList() {
        return deckList;
    }

    public void setDeckList(Vector<Deck> deckList) {
        this.deckList = deckList;
    }

}

