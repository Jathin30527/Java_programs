public class Main2 {
    public static void main(String[] args) {
        Student s1 =  new Student() ;
        s1.name = "Ravi" ;
        s1.display() ;
        Student s2 = new Student() ;
        s2.name = "Krishna" ;
        s2.display() ;
    }    
}
class Student {
    String name ;
    void 
    display (){System.out.println("Name :" + name );}
}