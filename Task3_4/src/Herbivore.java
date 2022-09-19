public class Herbivore extends Dinosaur{

    final String favoriteGrass;

    public Herbivore(int growth, int weight, String name, String favoriteGrass){
        super (growth, weight, name);
        this.favoriteGrass = favoriteGrass;
    }

    public void Eat(){
        System.out.println(String.format("Dinosaur %s eat trees", this.getName()));
    }
}
