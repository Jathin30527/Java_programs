public class Main6 {
    public static void main(String[] args) {
        Book b = new Book("Java" , 349.0)  ;
        System.out.println(b.title);
    }
    
}
class Book { 
    String title ; double price ;
    Book(String t , double p ) { 
        title = t ; price = p ;
    }
}
                  