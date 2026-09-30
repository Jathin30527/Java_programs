public class random {

    static double ComputeFee(String tier) { 
        switch (tier) {
            case "MEDIUM": return 35.0 ; 
                
            case "LARGE" : return 50.0 ; 
                 
            default : return 20.0 ; 
         
        }
    }
}
    static void printReciept(String tier , double fee ) { 
        System.out.println("Tier: " + tier);
        System.out.println("Fee: %.2f%n", fee);
    }
    public static void main(String[] args) {
        String tier = assigntier('L' , 3.2) ; 
        printReciept(tier, computeFee(tier));
    }                                                          
          