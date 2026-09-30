public class Main3 {
    public static void main(String[] args) {
        circle c = new circle() ;
        c.radius = 5.0 ;
        System.out.println(c.area());
    }
    
}
class circle { 
    double radius ;
    double area() {
        return Math.PI*radius*radius ;
    }
}

