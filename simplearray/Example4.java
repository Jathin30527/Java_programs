import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        int[] employID = {101 , 102 , 103 , 104 , 105 ,};
        System.out.println("Enter array index (0 to 4): ");
        int index = scn.nextInt() ; 
        if (index >= 0 && index < employID.length) {
            System.out.println("employ ID: " + employID[index]);
        } else { 
            System.out.println("Invalid array index.");
        
            
        }
        scn.close();
    }
    
}
