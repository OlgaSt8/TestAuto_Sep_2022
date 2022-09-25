public abstract class Dinosaur implements Eating{
    private  int growth;
    private int weight;
    private String name;

    public Dinosaur() {};

    public class Habitat {
        private String country;
        private String region;
        public Habitat(String country, String region) {
            this.country = country;
            this.region = region;
        }

        @Override
        public String toString() {
            return "Habitat{" +
                    "country='" + country + '\'' +
                    ", region='" + region + '\'' +
                    '}';
        }
    }
    public int getGrowth(){
        return growth;
    }

    public int getWeight(){
        return weight;
    }

    public String getName(){
        return name;
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

    protected Dinosaur(int growth, int weight, String name){
        this.growth = growth;
        this.weight = weight;
        this.name = name;
    }

    public void Eat(){
        System.out.println(String.format("Dinosaur %s eat plants and meat", this.getName()));
    }


}
