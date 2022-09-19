public class Program {
    public static void main (String[] args){
        Herbivore herbivore = new Herbivore(3,5,"Jon", "Flower");
        herbivore.setGrowth(10);
        herbivore.setWeight(15);

        Diplodoc firstDiplodoc = new Diplodoc(3,500,"Nick", "Young Grass", 15);
        Diplodoc secondDiplodoc = new Diplodoc(2,400,"Nick's son", "Shrub", 8);

        Diplodoc.getDiplodocCount();

        herbivore.Eat();
        firstDiplodoc.Eat();
        secondDiplodoc.Eat();

        System.out.println(String.format("%s | %s | %s | %s", herbivore.getGrowth(), herbivore.getWeight(), herbivore.getName(), herbivore.favoriteGrass));
        System.out.println(firstDiplodoc.toString());
        System.out.println(secondDiplodoc.toString());
    }
}
