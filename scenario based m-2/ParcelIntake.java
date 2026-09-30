import java.util.Scanner;
public class ParcelIntake {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        String id = scn.next() ;
        String recipient = scn.next() ;
        char size = scn.next() .charAt(0) ; 
        double weight = scn.nextDouble() ; 
        //
        int base = (size == 'L') ? 30 : (size == 'M') ? 20 : 20 ;
        int surchange = (int) Math.ceil(weight) * 2 ; 

        int fee = base + surchange ; 

        System.out.printf("Parcel : % s (%s) %n" , id , recipient);
        System.out.printf("Size : %c Weight : %.1fkg%n", size, weight);
        System.out.printf("Fee : Rs %d%n" , fee);


    }
    
}