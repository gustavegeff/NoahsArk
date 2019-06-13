package Animals;

public abstract class Reptile extends Animal implements Carnivourous {

    public Reptile(double size) {
        super(size);
    }

    public void swim()
    {
        System.out.println("I'm swimming");
    }

    public void eat(Animal a){
        System.out.println("pssss " + a.getSpecies());
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }
}
