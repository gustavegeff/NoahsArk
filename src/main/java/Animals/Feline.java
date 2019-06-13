package Animals;

public class Feline extends Mammal implements Carnivourous {

    public Feline(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 100);
    }

    @Override
    public void eat(Animal a){
        System.out.println("croc croc a " + a.getSpecies());
    }
    @Override
    public void hunt(){
        System.out.println("I'm hunting");
    }

}
