public class Program {
    public static void main (String[] args){
       Dinosaur dinosaur = new Dinosaur() {
            @Override
            public int getGrowth() {
                return super.getGrowth();
            }
            @Override
            public int getWeight() {
                return super.getWeight();
            }
            @Override
            public String getName() {
                return super.getName();
            }
        };

        Dinosaur.Habitat diplodocNick = dinosaur.new Habitat("USA", "Minnesota");
        Dinosaur.Habitat diplodocRock = dinosaur.new Habitat("China", "Beijing");

        System.out.print(diplodocNick);
        System.out.print(diplodocRock);
        System.out.println("\n");

        Herbivore herbivore = new Herbivore(3,5,"Jon", "Flower");
        herbivore.setGrowth(10);
        herbivore.setWeight(15);

        Diplodoc firstDiplodoc = new Diplodoc(3,500,"Nick", "Young Grass", 15);
        Diplodoc secondDiplodoc = new Diplodoc(2,400,"Nick's son", "Shrub", 8);

        Diplodoc.neckLenghtComparator neckLenghtComparator = new Diplodoc.neckLenghtComparator();

        System.out.println(neckLenghtComparator.compare(firstDiplodoc, secondDiplodoc));

        Eating eating = new Eating() {
            @Override
            public void Eat() {
                System.out.println("any plant");
            }
        };
        eating.Eat();
        Diplodoc.getDiplodocCount();

        herbivore.Eat();
        firstDiplodoc.Eat();
        secondDiplodoc.Eat();

        System.out.println(String.format("%s | %s | %s | %s", herbivore.getGrowth(), herbivore.getWeight(), herbivore.getName(), herbivore.favoriteGrass));
        System.out.println(firstDiplodoc.toString());
        System.out.println(secondDiplodoc.toString());
    }
}
