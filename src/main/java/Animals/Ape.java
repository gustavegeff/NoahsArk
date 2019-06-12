package Animals;

public class Ape extends Mammal implements Carnivourous, Herbivorous {

    public Ape(int size) {
        super(size);
    }

    @Override
    public void eat(Animal a){
        System.out.println("croc croc " + a.getSpecies());
    }

    public void runFrom(Animal a) {
        System.out.println("oh no a " + a.getSpecies() + " is chasing me");
    }

    public void eat() {
        System.out.println("let's eat fruit");
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }

}
