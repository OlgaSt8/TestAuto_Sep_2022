public class Fibonacci {

    public static void main (String args[]) {

        int n=2;

        if (n<0) {
            System.out.print("Not");
        }
        else {
            System.out.print(fib(n));
        }
    }

    public static int fib (int n) {
        if (n==0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        else {
            return fib(n-1)+fib(n-2);
        }
    }
}



