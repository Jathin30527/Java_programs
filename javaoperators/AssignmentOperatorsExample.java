import java.util.Scanner;
public class AssignmentOperatorsExample {
     public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Eneter a number:");
        int num = sc.nextInt();
        
        //=assignment operator 
        int value = num;
        System.out.println("\nAfter '=' Assignment : " + value);

        //+=add and assign
        value += 10;
        System.out.println("After '+=' (Add 10):" + value);

        //-= sub and assign
        value-= 5;
        System.out.println("After '-=' (Subtract 5) : " + value);
        
        // *= Multiply and Assign

        value*=2;
        System.out.println("After '*=' (Multiply by 2): " + value);

        // /= divide and assign 
        value /= 3;
        System.out.println("After '/=' (Divide by 3):" + value);

        // %= modulus and assign

        value %= 5;
        System.out.println("After '%=' (Modulus by 4) : " + value);

        sc.close();
     
    }
}

    


