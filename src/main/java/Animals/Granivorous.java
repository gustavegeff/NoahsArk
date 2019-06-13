package Animals;

public class Granivorous extends Mammal implements Herbivorous {

    public Granivorous(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 1);
    }
    @Override
    public void runFrom(Animal a)
    {
        System.out.println("oh no a " + a.getSpecies() + " is chasing me");
    }
    @Override
    public void eat() {
        System.out.println("let's eat seeds");
    }
}
