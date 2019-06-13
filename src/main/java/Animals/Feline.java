package Animals;

public class Feline extends Mammal implements Carnivourous {

    public Feline(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 100);
    }

    @Override
    public void eat(Animal a){
        if (this.getSize() > a.getSize())
            System.out.println("croc croc " + a.getSpecies());
        else
            System.out.println("I can't eat a " + a.getSpecies() + " this big");
    }
    @Override
    public void hunt(){
        System.out.println("I'm hunting");
    }

}
