import java.util.Scanner;
public class Q2HighestSale {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        double[] sales = new double[7] ; 

        System.out.println("Enter sales for 7 days :");
        for (int i = 0; i < sales.length ; i++) { 
            sales[i] = scn.nextDouble() ; 
        }
        double max = sales[0] ;
        int day = 0 ;
        for(int i = 1 ; i < sales.length; i++) { 
            if (sales[i] > max) {
                max = sales[i] ; 
                day = 1 ; 
            }
        }
    }
}
