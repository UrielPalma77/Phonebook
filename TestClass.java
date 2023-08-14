//Christian Palma
// CS 145
//07/18/2023

// the main class displayes the menue for the user to follow 
// directions and make adjustments to the phonebook
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        PhonebookManager phonebookManager = new PhonebookManager();
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            System.out.println("Phonebook Menu:");
            System.out.println("1. Add an entry");
            System.out.println("2. Delete an entry");
            System.out.println("3. Modify an entry");
            System.out.println("4. Print phonebook");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
                // all info is assign to the coresponding node using the scanner 
                // the scanner reads the input line and assigns it to the correct node
                switch (choice) {
                case 1:
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter Address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter City: ");
                    String city = scanner.nextLine();
                    System.out.print("Enter Phone Number: ");
                    String phoneNumber = scanner.nextLine();

                    phonebookManager.addEntry(firstName, lastName, address, city, phoneNumber);
                    System.out.println("Entry added successfully!");
                    System.out.println();
                    break;
                    // the deleteEntry method is called to delete the info matching the scanner
                case 2:
                    System.out.print("Enter Phone Number to delete: ");
                    String numberToDelete = scanner.nextLine();

                    phonebookManager.deleteEntry(numberToDelete);
                    System.out.println();
                    break;
                    // the info matching the phone number is modify using the modifyEntry method
                case 3:
                    System.out.print("Enter Phone Number to modify: ");
                    String numberToModify = scanner.nextLine();

                    System.out.print("Enter New Phone Number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter New First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
                    System.out.print("Enter New Address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter New City: ");
                    String newCity = scanner.nextLine();

                    phonebookManager.modifyEntry(numberToModify, newFirstName, newLastName, newAddress, newCity);
                    System.out.println("Entry modified successfully!");
                    System.out.println();
                    break;
                    // displayes the saved info
                case 4:
                    System.out.println("Phonebook Entries:");
                    phonebookManager.printPhonebook();
                    System.out.println();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    System.out.println();
            }
        }

        System.out.println("Exiting Phonebook. Goodbye!");
        scanner.close();
    }
}
