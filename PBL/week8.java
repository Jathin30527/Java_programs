import java.util.Scanner;
public class week8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        try { 
            System.out.print("Enter parcel weight : ");
            double weight = Double.parseDouble(scn.nextLine()) ;
            System.out.println("WEIGHT ACCEPTED " + weight + "kg");}
        catch (NumberFormatException e) {
            System.out.println("Invalid weight " + "Please eneter a number ");
            
            System.out.println("Weight checking completed ");
            
        }
    }    
}