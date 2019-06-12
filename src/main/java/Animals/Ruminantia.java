package Animals;

public class Ruminantia extends Mammal implements Herbivorous {

    public Ruminantia(int size) {
        super(size);
    }

    public void runFrom(Animal a)
    {
        System.out.println("oh no a " + a.getSpecies() + " is chasing me");
    }

    public void eat() {
        System.out.println("let's eat grass");
    }
}
