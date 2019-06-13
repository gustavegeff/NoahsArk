package Animals;

public class Ape extends Mammal implements Carnivourous, Herbivorous {

    public Ape(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 85);
    }

    @Override
    public void eat(Animal a){
        System.out.println("croc croc " + a.getSpecies());
    }
    @Override
    public void runFrom(Animal a) {
        System.out.println("oh no a " + a.getSpecies() + " is chasing me");
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
