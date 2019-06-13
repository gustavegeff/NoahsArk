package Animals;

public abstract class Animal {
    private double size;
    private double weight;
    private String species;

    public Animal(double size) {
        this.size = size;
    }

    public void whatAmI(){
        System.out.println("I am a " + getSpecies() + " from the " + this.getClass().getSimpleName() + " family.");
    };

    public boolean isCarnivorous(){
        if (this.getClass().isAssignableFrom(Feline.class) || this.getClass().isAssignableFrom(Crocodilians.class)
                || this.getClass().isAssignableFrom(Raptor.class) || this.getClass().isAssignableFrom(Serpentes.class)
                || this.getClass().isAssignableFrom(Ape.class))
            return true;
        return false;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
