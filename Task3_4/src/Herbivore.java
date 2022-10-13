import java.io.Serializable;

public class Herbivore extends Dinosaur implements  Serializable {

    protected String favoriteGrass;

    public Herbivore(int growth, int weight, String name, String favoriteGrass, String country, String region){
        super(growth, weight, name, country, region);
        this.favoriteGrass = favoriteGrass;
    }

    @Override
    public String toString(){
        return String.format("Herbivore %s with characteristics: growth=%s |weight=%s |favoriteGrass=%s |habitat=%s", this.name, this.growth, this.weight, this.favoriteGrass, this.habitat);
    }

    public void Eat(){
        System.out.printf("Dinosaur %s eat trees", this.name);
    }
}
