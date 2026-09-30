class Person {
    void showPerson() { 
        System.out.println("I am a person");
    }
}
class Employee extends Person { 
    void shwoEmployee() { 
        System.out.println("I am an employee");
    }
}
class Manager extends Employee { 
    void showManager() { 
        System.out.println("I am a manager");
    }
    public class Program7 {
    
        public static void main(String[] args) {
            Manager m = new Manager();

            m.showPerson();
            m.shwoEmployee();
            m.showManager();
        }
    }
}


    