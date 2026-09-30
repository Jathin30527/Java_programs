import java.util.Scanner;
public class ParkingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Track available spaces instead of using an array
        int freeTwoWheelers = 5;
        int freeFourWheelers = 5;
        
        System.out.println("--- Parking Lot System ---");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. View Empty Slots");
            System.out.println("4. Quit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Vehicle type (1 for 2-wheeler, 2 for 4-wheeler): ");
                int type = sc.nextInt();
                
                // Nested if to check type and availability
                if (type == 1) {
                    if (freeTwoWheelers > 0) {
                        freeTwoWheelers--;
                        System.out.println("Parked at Floor 0. Spots left: " + freeTwoWheelers);
                    } else {
                        System.out.println("Floor 0 is full!");
                    }
                } else if (type == 2) {
                    if (freeFourWheelers > 0) {
                        freeFourWheelers--;
                        System.out.println("Parked at Floor 1. Spots left: " + freeFourWheelers);
                    } else {
                        System.out.println("Floor 1 is full!");
                    }
                } else {
                    System.out.println("Invalid vehicle type.");
                }

            } else if (choice == 2) {
                System.out.print("Vehicle type exiting (1 for 2-wheeler, 2 for 4-wheeler): ");
                int type = sc.nextInt();

                if (type == 1) {
                    if (freeTwoWheelers < 5) {
                        freeTwoWheelers++;
                        System.out.print("Hours parked: ");
                        int hrs = sc.nextInt();
                        System.out.println("Vehicle removed. Bill: Rs " + (hrs * 20));
                    } else {
                        System.out.println("Error: No 2-wheelers are currently parked.");
                    }
                } else if (type == 2) {
                    if (freeFourWheelers < 5) {
                        freeFourWheelers++;
                        System.out.print("Hours parked: ");
                        int hrs = sc.nextInt();
                        System.out.println("Vehicle removed. Bill: Rs " + (hrs * 50));
                    } else {
                        System.out.println("Error: No 4-wheelers are currently parked.");
                    }
                } else {
                    System.out.println("Wrong input.");
                }

            } else if (choice == 3) {
                System.out.println("\nAvailability:");
                System.out.println("Two wheelers (Floor 0): " + freeTwoWheelers + " empty");
                System.out.println("Four wheelers (Floor 1): " + freeFourWheelers + " empty");
                
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break; 
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        
        sc.close();
    }
}