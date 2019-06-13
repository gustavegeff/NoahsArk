package Animals;

public class Raptor extends Bird implements Carnivourous {

    public Raptor(double size,String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 2);
    }

    @Override
    public void eat(Animal a){
        System.out.println("arrr arrrr plunging toward a " + a.getSpecies());
    }
    @Override
    public void hunt(){
        System.out.println("I'm hunting");
    }

}
