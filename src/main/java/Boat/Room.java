package Boat;

import Animals.*;
import java.util.Vector;

public class Room {
    private int capacity;
    private int maxWeight;
    private Vector<Animal> animalList;

    public Room(int capacity, int maxWeight) {
        this.capacity = capacity;
        this.maxWeight = maxWeight;
        this.animalList = new Vector<>();
    }


    //get the percentage of the room's occupancy
    public int getRoomFillingPercentage()
    {
        int tot = 0;
        for (Animal a: animalList)
            tot += a.getWeight();
        return tot / maxWeight * 100;
    }

    //test if the room is big enough AND has no predators
    private boolean isThereSpaceLeft(Animal a, boolean scnd){
        double spaceLeft = maxWeight - (getRoomFillingPercentage() * maxWeight);
        if (capacity - animalList.size() <= 0)
            return false;
        if (scnd)
        {
            if (spaceLeft > a.getWeight())
                return true;
        }
        if ( spaceLeft > 2 * a.getWeight()
            && ((spaceLeft >= a.getWeight()) && (spaceLeft < 1.2 * a.getWeight())))
        {
            return true;
        }
        return false;

    }
    public boolean isRoomSuitable(Animal a){
        boolean acc = false;
        if (isThereSpaceLeft(a,false))
            acc = true;
        else
            acc = isThereSpaceLeft(a,true);
        if (acc) {
            if (a.isCarnivorous())
                return canAcceptCarnivorous(a);
            else
                return canAcceptHerbivorous(a);
        }
        return false;
    }

    private boolean canAcceptCarnivorous(Animal a)
    {
        for (Animal b : animalList)
        {
            if(!b.isCarnivorous() && b.getSize() <= a.getSize())
                return false;
        }
        return true;
    }
    private boolean canAcceptHerbivorous(Animal a)
    {
        for (Animal b : animalList)
        {
            if(b.isCarnivorous() && b.getSize() >= a.getSize())
                return false;
        }
        return true;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


    public int getFullWeight() {
        return maxWeight;
    }

    public void setFullWeight(int fullWeight) {
        this.maxWeight = fullWeight;
    }

    public Vector<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(Vector<Animal> animalList) {
        this.animalList = animalList;
    }
}
