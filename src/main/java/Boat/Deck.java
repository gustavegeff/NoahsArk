package Boat;

import java.util.HashSet;

public class Deck {
    private int maxWeight;
    private int nbOfRooms;
    private HashSet<Room> roomList;

    public Deck(int maxWeight) {
        this.maxWeight = maxWeight;
        this.roomList = new HashSet<>();
    }

    //get the total occupancy of the deck by adding all room occupancies
    public int getDeckOccupancy()
    {
        int tot = 0;
        int top = 0;
        for (Room r: roomList) {
            tot += r.getRoomFillingPercentage();
            top += 100;
        }
            return tot / top * 100;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public HashSet<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(HashSet<Room> roomList) {
        this.roomList = roomList;
    }

    public int getNbOfRooms() {
        return nbOfRooms;
    }

    public void setNbOfRooms(int nbOfRooms) {
        this.nbOfRooms = nbOfRooms;
    }
}
