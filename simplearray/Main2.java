import java.util.Scanner ; 
public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ; 
        int n = scn.nextInt() ; 
        int[] arr = new int[n] ;
        for(int i = 0; i <n ; i ++) { 
            arr[i] = scn.nextInt() ; 
        }
        int q = scn.nextInt() ; 
        for(int i =0 ; i<q ; i++) { 
            int x = scn.nextInt() ; 
            System.out.println(arr[x-1] + " ");
        } 
    }
    
}
