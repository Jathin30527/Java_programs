public class Operators {
    public static void main(String[] args) {
        int a = 17 , b = 5 ;
        
        System.out.println("a + b =" + (a  + b));

        System.out.println("a - b +" + (a - b));

        System.out.println("a * b =" + (a * b));

        System.out.println("a / b = " + (a / b));

        System.out.println("a % b = " + (a % b));

        int neg = -a ; // unary minus

        boolean open = true ; 
        boolean shut = !open ; // logical NOt 
        
        int count = 0 ; 
        count++; // increment count becomes 1 

        System.out.println("neg = " + neg + " , shut = " + shut + ", count = " + count );
        String parity = (a % 2 == 0) ? "even" : "odd" ;
        System.out.println("a is " + parity);

    }
    
}
