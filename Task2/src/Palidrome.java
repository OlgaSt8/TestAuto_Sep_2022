public class Palidrome{

    public static void main (String[] args) {
        int number= 121;
        int newNumber = number;
        int rev = 0;

        while (number!=0) {
            rev = rev*10 + number%10;
            number = number / 10;
        }
        if (newNumber == rev) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}