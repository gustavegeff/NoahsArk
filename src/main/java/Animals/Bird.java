package Animals;

public abstract class Bird extends Animal {
    public Bird(int size) {
        super(size);
    }

    public void fly()
    {
        System.out.println("I'm flying");
    }
}
