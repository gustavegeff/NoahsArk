package Animals;

public class Granivorous extends Mammal implements Herbivorous {

    public Granivorous(int size) {
        super(size);
    }

    public void runFrom(Animal a)
    {
        System.out.println("oh no a " + a.getSpecies() + " is chasing me");
    }

    public void eat() {
        System.out.println("let's eat seeds");
    }
}
