public class MethodExample8 {
    void display() { 
        System.out.println("this is a no static mwethod");
    }

    public static void main(String[] args) {
        MethodExample8 obj = new MethodExample8() ;
        obj.display();
    }
     
    
}
