public class Example2 {
    public static void main(String[] args) {
        int[] prices = new int[5] ; 

        // insert data 
        prices[0] = 100 ; 
        prices[1] = 250 ; 
        prices[2] = 150 ; 
        prices[3] = 300 ; 
        prices[4] = 200 ; 

        // retrieve all data
        for (int i = 0 ; i < prices.length ; i++) { 
            System.out.println("product " + (i + 1) + "price:" + prices[i]);
        }
    }
                                                  
    
}
