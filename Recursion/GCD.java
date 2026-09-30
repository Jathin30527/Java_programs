import java.util.Scanner;
public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a ;
    
        }
        return gcd(b, a % b) ;
    
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter 1st number :");
        int a = scn.nextInt() ;
        System.out.println("Enter 2nd number :"  );
        int b = scn.nextInt() ;

        System.out.println("GCD = " + gcd(a , b ));
    }
}
