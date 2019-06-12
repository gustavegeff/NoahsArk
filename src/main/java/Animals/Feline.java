package Animals;

public class Feline extends Mammal implements Carnivourous {

    public Feline(int size) {
        super(size);
    }

    @Override
    public void eat(Animal a){
        System.out.println("croc croc " + a.getSpecies());
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }

}
