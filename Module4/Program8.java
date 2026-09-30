class shape { 
    void show() { 
        System.out.println("This is a shape ");
    }
}
class Circle extends shape { 
    void Circle() { 
        System.out.println("This is a circle ");
    }
}
 class Rectangle extends shape { 
    void Rectangle() { 
        System.out.println("This is a rectangle ");
    }
}
class shapeDemo { 
    public static void main(String[] args) {
        Circle c = new Circle() ; 

    }
}
