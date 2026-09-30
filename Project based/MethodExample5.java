import java.util.Scanner;
public class MethodExample5 {
    static int square(int n) { 
        return n*n ; 
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 

        System.out.println("Enter a number: ");
        int n = scn.nextInt() ; 

        int result = square(n) ; 
        System.out.println("Square = " + result);

        scn.close() ; 

    }

    
}
