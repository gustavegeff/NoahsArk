import java.util.Vector;

public class Room {
    private int capacity;
    private int nbOfAnimals;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNbOfAnimals() {
        return nbOfAnimals;
    }

    public void setNbOfAnimals(int nbOfAnimals) {
        this.nbOfAnimals = nbOfAnimals;
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
