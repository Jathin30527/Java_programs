import java.util.Scanner;

public class ParkingLotSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 0 = two wheelers, 1 = four wheelers
        // 5 slots per floor
        boolean[][] slots = new boolean[2][5]; 
        
        System.out.println("--- Parking Lot System ---");

        // Keep running until user chooses to exit
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
                
                boolean parked = false;

                for (int i = 0; i < 5; i++) {
                    // Check floor 0 for 2-wheelers
                    if (type == 1) {
                        if (slots[0][i] == false) {
                            slots[0][i] = true; 
                            System.out.println("Parked 2-wheeler at floor 0, slot " + i);
                            parked = true;
                            break; 
                        }
                    } 
                    // Check floor 1 for 4-wheelers
                    else if (type == 2) {
                        if (slots[1][i] == false) {
                            slots[1][i] = true;
                            System.out.println("Parked 4-wheeler at floor 1, slot " + i);
                            parked = true;
                            break;
                        }
                    }
                }

                if (!parked) {
                    System.out.println("Parking is full!");
                }

            } else if (choice == 2) {
                System.out.print("Enter floor (0 or 1): ");
                int f = sc.nextInt();
                System.out.print("Enter slot (0-4): ");
                int s = sc.nextInt();

                // Validate inputs
                if (f >= 0 && f <= 1 && s >= 0 && s < 5) {
                    if (slots[f][s] == true) {
                        slots[f][s] = false; 
                        
                        System.out.print("Hours parked: ");
                        int hrs = sc.nextInt();
                        
                        int amount = 0;
                        if (f == 0) {
                            amount = hrs * 20;
                        } else {
                            amount = hrs * 50;
                        }
                        
                        System.out.println("Vehicle removed. Bill: Rs " + amount);
                    } else {
                        System.out.println("Slot is already empty.");
                    }
                } else {
                    System.out.println("Wrong input.");
                }

            } else if (choice == 3) {
                System.out.println("\nAvailability:");
                
                for (int i = 0; i < 2; i++) {
                    int free = 0;
                    for (int j = 0; j < 5; j++) {
                        if (slots[i][j] == false) {
                            free++;
                        }
                    }
                    if (i == 0) {
                        System.out.println("Two wheelers (Floor 0): " + free + " empty");
                    } else {
                        System.out.println("Four wheelers (Floor 1): " + free + " empty");
                    }
                }
                
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break; // Breaks the while(true) loop
            } else {
                System.out.println("Invalid choice, try again.");
            }
        }
        
        sc.close();
    }
}