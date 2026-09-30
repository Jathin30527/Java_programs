import java.util.Scanner;
public class SumOfDigits {
    static int sum(int n ) {
        if (n == 0) {
            return 0 ;
            
        }
        return (n % 10) + sum(n / 10);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter number : ");
        int n = scn.nextInt() ;
        System.out.println("Sum of digits  = " + sum(n));

    
    }

    
    
}
