import java.io.Serializable;

public abstract class Dinosaur implements Serializable, Eating {
    protected int growth;
    protected int weight;
    protected String name;
    protected Habitat habitat;

    public int getGrowth() { return growth; }
    public int getWeight(){ return weight;}
    public String getName() { return name; }
    public Habitat getHabitat() { return habitat;}

    public Dinosaur  (int growth, int weight, String name, String country, String region){
        this.growth = growth;
        this.weight = weight;
        this.name = name;
        this.habitat = new Habitat(country, region);
    }

    public class Habitat implements Serializable {
        private String country;
        private String region;
        public Habitat (String country, String region) {
            this.country = country;
            this.region = region;
        }

        @Override
        public String toString() {
            return "Habitat country='" + country + "', region='" + region + "'";
        }
    }

   public void setGrowth(int growth){
        if ((growth>0) && (growth<35)) {
            this.growth = growth;
        } else {
            System.out.println("Invalid growth");
        }
    }

    public void setWeight(int weight){
        if ((weight > 0) && (weight < 85)) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void Eat(){
        System.out.printf("Dinosaur %s eat plants and meat", this.name);
    }
}
