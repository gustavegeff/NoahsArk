package Animals;

public abstract class Reptile extends Animal implements Carnivourous {

    public Reptile(int size) {
        super(size);
    }

    public void fly()
    {
        System.out.println("I'm flying");
    }

    public void eat(Animal a){
        System.out.println("pssss " + a.getSpecies());
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }
}
