import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Create a new boat with how many decks ?");
        int nbOfDecks = reader.nextInt();
        Boat ark = new Boat(nbOfDecks);
        ark.create();
        System.out.println(ark.getBoatOccupancy());
        System.out.println(ark.getDeckList());
        for (Deck d: ark.getDeckList()) {
            System.out.println(d.getRoomList());
        }

        //ark.fill();
    }
}
