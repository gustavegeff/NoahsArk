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
        if (this.getSize() > a.getSize())
            System.out.println("psss yum a " + a.getSpecies());
        else
            System.out.println("I can't eat a " + a.getSpecies() + " this big");
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }
}
