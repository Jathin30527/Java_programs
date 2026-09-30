import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        int[] marks = new int[4] ;
        
        // insert data using keyword 
        System.out.println("Enter marks of 4 student : ");
        for (int i = 0 ; i < marks.length ; i++) { 
            marks[i] = scn.nextInt() ; 
        }
        
        // retrive data 
        System.out.println("stored marks : ");
        for ( int i= 0 ; i < marks.length ; i++ ) { 
            System.out.println("Student " + (i + 1) + ":" + marks[i]);
        } 

    }
    
}
