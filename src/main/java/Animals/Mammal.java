package Animals;

public abstract class Mammal extends Animal {
    public Mammal(int size) {
        super(size);
    }

    public void Gestate()
    {
        System.out.println("I'm gestating");
    }
}
