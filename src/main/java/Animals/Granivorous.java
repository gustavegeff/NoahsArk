package Animals;

public class Granivorous extends Bird implements Herbivorous {

    public Granivorous(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 1);
    }
    @Override
    public void runFrom(Animal a)
    {
        if (this.getSize() < a.getSize())
            System.out.println("oh no a " + a.getSpecies() + " is chasing me");
        else
            System.out.println("a " + a.getSpecies() + " this small can't eat me");
    }
    @Override
    public void eat() {
        System.out.println("let's eat seeds");
    }
}
