import java.util.Scanner;
public class Q1StudentMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        int[] marks = new int[5] ; 
        int total = 0 ; 
        System.out.println("enter marks of 5 students");
        for(int i = 0 ; i < marks.length ; i++) { 
            marks[i] = scn.nextInt() ;
        }
        
        double avg = (double) total / marks.length ; 
        System.out.println("Total =" + total);
        System.out.printf("Average = %.ef%n" , avg);
        scn.close();
    }
    
}
