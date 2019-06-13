package Animals;

public class Serpentes extends Reptile {

    public Serpentes(double size, String species) {
        super(size);
        this.setSpecies(species);
        this.setWeight(size * 15);
    }

}
