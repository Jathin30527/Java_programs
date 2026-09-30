import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Variables for Book 1 (Empty strings mean the slot is free)
        String b1Title = "", b1Author = "", b1Category = "";
        boolean b1Issued = false;

        // Variables for Book 2
        String b2Title = "", b2Author = "", b2Category = "";
        boolean b2Issued = false;

        // Variables for Book 3
        String b3Title = "", b3Author = "", b3Category = "";
        boolean b3Issued = false;

        // Variables for 2 Members
        String m1Name = "", m2Name = "";

        System.out.println("--- Library Management System ---");

        // while loop: keep program running until exit
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Register Member");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book & Fine");
            System.out.println("7. Search Book");
            System.out.println("8. Display All Books");
            System.out.println("9. Exit");
            System.out.print("Enter choice: ");
            
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            // switch: menu options
            switch (choice) {
                case 1:
                    System.out.print("Title: ");
                    String t = sc.nextLine();
                    System.out.print("Author: ");
                    String a = sc.nextLine();
                    System.out.print("Category: ");
                    String c = sc.nextLine();
                    
                    // Find an empty variable slot to save the book
                    if (b1Title.equals("")) {
                        b1Title = t; b1Author = a; b1Category = c;
                        System.out.println("Book added in slot 1!");
                    } else if (b2Title.equals("")) {
                        b2Title = t; b2Author = a; b2Category = c;
                        System.out.println("Book added in slot 2!");
                    } else if (b3Title.equals("")) {
                        b3Title = t; b3Author = a; b3Category = c;
                        System.out.println("Book added in slot 3!");
                    } else {
                        System.out.println("Library is full! Max 3 books allowed.");
                    }
                    break;

                case 2:
                    System.out.print("Enter title of book to update: ");
                    String updateTitle = sc.nextLine();
                    
                    if (!b1Title.equals("") && b1Title.equalsIgnoreCase(updateTitle)) {
                        System.out.print("New Author: "); b1Author = sc.nextLine();
                        System.out.print("New Category: "); b1Category = sc.nextLine();
                        System.out.println("Book updated.");
                    } else if (!b2Title.equals("") && b2Title.equalsIgnoreCase(updateTitle)) {
                        System.out.print("New Author: "); b2Author = sc.nextLine();
                        System.out.print("New Category: "); b2Category = sc.nextLine();
                        System.out.println("Book updated.");
                    } else if (!b3Title.equals("") && b3Title.equalsIgnoreCase(updateTitle)) {
                        System.out.print("New Author: "); b3Author = sc.nextLine();
                        System.out.print("New Category: "); b3Category = sc.nextLine();
                        System.out.println("Book updated.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter title of book to delete: ");
                    String delTitle = sc.nextLine();
                    
                    if (!b1Title.equals("") && b1Title.equalsIgnoreCase(delTitle)) {
                        b1Title = ""; b1Author = ""; b1Category = ""; b1Issued = false;
                        System.out.println("Book deleted.");
                    } else if (!b2Title.equals("") && b2Title.equalsIgnoreCase(delTitle)) {
                        b2Title = ""; b2Author = ""; b2Category = ""; b2Issued = false;
                        System.out.println("Book deleted.");
                    } else if (!b3Title.equals("") && b3Title.equalsIgnoreCase(delTitle)) {
                        b3Title = ""; b3Author = ""; b3Category = ""; b3Issued = false;
                        System.out.println("Book deleted.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 4:
                    System.out.print("Enter member name: ");
                    String name = sc.nextLine();
                    
                    if (m1Name.equals("")) {
                        m1Name = name;
                        System.out.println("Member 1 registered.");
                    } else if (m2Name.equals("")) {
                        m2Name = name;
                        System.out.println("Member 2 registered.");
                    } else {
                        System.out.println("Member slots full!");
                    }
                    break;

                case 5:
                    System.out.print("Enter book title to issue: ");
                    String issueTitle = sc.nextLine();
                        
                    if (!b1Title.equals("") && b1Title.equalsIgnoreCase(issueTitle)) {
                        // if-else: check if book is available
                        if (b1Issued == true) {
                            System.out.println("Sorry, this book is already issued.");
                        } else {
                            b1Issued = true;
                            System.out.println("Book issued successfully.");
                        }
                    } else if (!b2Title.equals("") && b2Title.equalsIgnoreCase(issueTitle)) {
                        if (b2Issued == true) {
                            System.out.println("Sorry, this book is already issued.");
                        } else {
                            b2Issued = true;
                            System.out.println("Book issued successfully.");
                        }
                    } else if (!b3Title.equals("") && b3Title.equalsIgnoreCase(issueTitle)) {
                        if (b3Issued == true) {
                            System.out.println("Sorry, this book is already issued.");
                        } else {
                            b3Issued = true;
                            System.out.println("Book issued successfully.");
                        }
                    } else {
                        System.out.println("We don't have that book.");
                    }
                    break;

                case 6:
                    System.out.print("Enter book title to return: ");
                    String retTitle = sc.nextLine();
                    
                    boolean found = false;
                    boolean wasIssued = false;

                    if (!b1Title.equals("") && b1Title.equalsIgnoreCase(retTitle)) {
                        found = true;
                        if (b1Issued) { b1Issued = false; wasIssued = true; }
                    } else if (!b2Title.equals("") && b2Title.equalsIgnoreCase(retTitle)) {
                        found = true;
                        if (b2Issued) { b2Issued = false; wasIssued = true; }
                    } else if (!b3Title.equals("") && b3Title.equalsIgnoreCase(retTitle)) {
                        found = true;
                        if (b3Issued) { b3Issued = false; wasIssued = true; }
                    }

                    if (found) {
                        if (wasIssued) {
                            System.out.print("How many days late are you? (0 if on time): ");
                            int daysLate = sc.nextInt();
                            if (daysLate > 0) {
                                System.out.println("Book returned. Late Fine: Rs " + (daysLate * 15));
                            } else {
                                System.out.println("Book returned on time. No fine.");
                            }
                        } else {
                            System.out.println("Error: This book wasn't issued out.");
                        }
                    } else {
                        System.out.println("Book not found in our records.");
                    }
                    break;

                case 7:
                    System.out.print("Enter search keyword (Title/Author/Category): ");
                    String kw = sc.nextLine().toLowerCase();
                    System.out.println("\nSearch Results:");
                    
                    if (!b1Title.equals("") && (b1Title.toLowerCase().contains(kw) || b1Author.toLowerCase().contains(kw) || b1Category.toLowerCase().contains(kw))) {
                        System.out.println("- " + b1Title + " by " + b1Author);
                    }
                    if (!b2Title.equals("") && (b2Title.toLowerCase().contains(kw) || b2Author.toLowerCase().contains(kw) || b2Category.toLowerCase().contains(kw))) {
                        System.out.println("- " + b2Title + " by " + b2Author);
                    }
                    if (!b3Title.equals("") && (b3Title.toLowerCase().contains(kw) || b3Author.toLowerCase().contains(kw) || b3Category.toLowerCase().contains(kw))) {
                        System.out.println("- " + b3Title + " by " + b3Author);
                    }
                    break;

                case 8:
                    System.out.println("\nAll Books in Library:");
                    
                    // for loop: display all books using a counter since we don't have arrays
                    for (int i = 1; i <= 3; i++) {
                        if (i == 1 && !b1Title.equals("")) {
                            String status = b1Issued ? "[Issued]" : "[Available]";
                            System.out.println("1. " + b1Title + " | " + b1Author + " | " + b1Category + " " + status);
                        } else if (i == 2 && !b2Title.equals("")) {
                            String status = b2Issued ? "[Issued]" : "[Available]";
                            System.out.println("2. " + b2Title + " | " + b2Author + " | " + b2Category + " " + status);
                        } else if (i == 3 && !b3Title.equals("")) {
                            String status = b3Issued ? "[Issued]" : "[Available]";
                            System.out.println("3. " + b3Title + " | " + b3Author + " | " + b3Category + " " + status);
                        }
                    }
                    break;

                case 9:
                    System.out.println("Exiting the system...");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}