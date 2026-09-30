import java.util.Scanner;
public class ReverseString {
    static String reverse (String str) { 
        if (str.length() <= 1) {
            return str ;
            
        }
        return reverse(str.substring(1)) + str.charAt(0) ;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        System.out.println("Enter string : ");
        String str = scn.nextLine() ;
        System.out.println("Reverse = " + reverse(str));
        
    }
}
