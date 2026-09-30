import java.util.Scanner;
public class CountDigits {
    static int count(int n ) { 
        if (n == 0) {
            return 0 ;
            
        }
        return 1 + count(n/10) ;

    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        System.out.println("Enter a number: ");
        int n = scn.nextInt() ;
        System.out.println("Number of digits =" + count(n));
        
        
    }

}
