import java.util.Scanner;
public class Fibonacci {
    static int fibonacci(int n) {
        if (n<= 1 ) {
            return n ;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);    
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter position : ");
        int n = scn.nextInt() ;
        System.out.println("Fibonacci = " + fibonacci(n));
    }

    
}
