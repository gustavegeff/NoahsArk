package Animals;

public class Raptor extends Bird implements Carnivourous {

    public Raptor(int size) {
        super(size);
    }

    @Override
    public void eat(Animal a){
        System.out.println("aaar arrrr plunging toward a " + a.getSpecies());
    }

    public void hunt(){
        System.out.println("I'm hunting");
    }

}
