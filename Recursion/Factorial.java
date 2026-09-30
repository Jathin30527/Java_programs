import java.util.Scanner ; 
public class Factorial {

    static int factorial (int n ) { 
        if (n==0 || n ==1) {
            return 1 ; 
        }
        return n * factorial(n - 1) ; 
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Eneter a number :");
        int n = scn.nextInt() ; 
        System.out.println("Fatorial = " + factorial(n));

    }
}