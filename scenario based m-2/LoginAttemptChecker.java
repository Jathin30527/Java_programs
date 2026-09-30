import java.util.Scanner ; 
public class LoginAttemptChecker {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        String correctpassword = "uniflow123" ; 
        int attempts = 0 ; 
        boolean accessGranted = false ;
        
        while (attempts < 3) {
            System.out.println("Enter password:");
            String input = scn.nextLine() ; 
            attempts++;

            if (input.equals(correctpassword)) {
                accessGranted = true ; 
                break ; 
            }  else {
                System.out.println("incorrect password") ; 


                

                
            }
            
        }


                   
    }
}