package Animals;

public class Ape extends Mammal implements Carnivourous, Herbivorous {

    public Ape(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 85);
    }

    @Override
    public void eat(Animal a){
        if (this.getSize() > a.getSize())
            System.out.println("croc croc " + a.getSpecies());
        else
            System.out.println("I can't eat a " + a.getSpecies() + " this big");
    }
    @Override
    public void runFrom(Animal a) {
        if (this.getSize() < a.getSize())
            System.out.println("oh no a " + a.getSpecies() + " is chasing me");
        else
            System.out.println("a " + a.getSpecies() + " this small can't eat me");
    }
    @Override
    public void eat() {
        System.out.println("let's eat fruit");
    }
    @Override
    public void hunt(){
        System.out.println("I'm hunting");
    }

}
