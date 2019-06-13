package Animals;

public class Raptor extends Bird implements Carnivourous {

    public Raptor(double size,String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 2);
    }

    @Override
    public void eat(Animal a){
        if (this.getSize() > a.getSize())
            System.out.println("arrr arrr plungin toward a " + a.getSpecies());
        else
            System.out.println("I can't eat a " + a.getSpecies() + " this big");
    }
    @Override
    public void hunt(){
        System.out.println("I'm hunting");
    }

}
