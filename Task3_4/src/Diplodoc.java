import java.io.Serializable;

public final class Diplodoc extends Herbivore implements  Serializable {

    private static int diplodocCount;
    int neckLength;

    public static class neckLenghtComparator {
        public boolean compare (Diplodoc firstDiplodoc, Diplodoc secondDiplodoc) {
            return firstDiplodoc.neckLength == (secondDiplodoc.neckLength);
        }
    }

    public Diplodoc(int growth, int weight, String name, String favoriteGrass, int neckLength, String country, String region){
        super (growth, weight, name, favoriteGrass, country, region);
        this.neckLength = neckLength;
        diplodocCount ++;
    }

    public void Eat(){
        System.out.printf("Dinosaur %s eat flowers", this.getName());
    }

    @Override
    public String toString(){
        return String.format("Diplodoc %s with characteristics: growth=%s |weight=%s |favoriteGrass=%s |neckLenght=%s |habitat=%s", this.name, this.growth, this.weight, this.favoriteGrass, this.neckLength, this.habitat);
    }

    public String toCompactString(){
        return String.format("%s;%s;%s;%s;%s,%s", this.growth, this.weight, this.name, this.favoriteGrass, this.neckLength,this.habitat);
    }

    public static void getDiplodocCount(){
        System.out.println("Diplodoc count = " + diplodocCount);
    }


}
