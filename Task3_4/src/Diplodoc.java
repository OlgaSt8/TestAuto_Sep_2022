public final class Diplodoc extends Herbivore {

    private static int diplodocCount;
    int neckLength;

    Diplodoc(int growth, int weight, String name, String favoriteGrass,int neckLength){
        super (growth, weight, name, favoriteGrass);
        this.neckLength = neckLength;
        diplodocCount ++;
    }

    public void Eat(){
        System.out.println(String.format("Dinosaur %s eat flowers", this.getName()));
    }

    @Override
    public String toString(){
        return "Diplodoc " + this.getName() + " with characteristics: "+String.format("growth=%s | weight=%s |favoriteGrass=%s |neckLenght=%s", this.getGrowth(), this.getWeight(), this.favoriteGrass, this.neckLength);
    }

    public static void getDiplodocCount(){
        System.out.println("Diplodoc count = " + diplodocCount);
    }
}
