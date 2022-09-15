public class Sqrt {

    public static void main (String[] args) {

        int num = 10;
        double temp;
        double sqrt = num/2;
        do {
            temp=sqrt;
            sqrt= (temp+ (num/temp))/2;
        }
        while ((temp-sqrt)!=0);

        int sq = (int) sqrt;

        System.out.println(sq);
    }
}