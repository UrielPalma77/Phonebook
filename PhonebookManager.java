//Christian Palma
//CS145
//07/18/2023



// This is where the node of the phonbook linked list starts 
public class PhonebookManager {
    private ListNode start;
// the node is set to null and start an empty phonebook
    public PhonebookManager() {
        this.start = null;
    }
// add entry adds new information to the phonebook 
    public void addEntry(String firstName, String lastName, String address,
     String city, String phoneNumber) {
        ListNode newNode = new ListNode(firstName, lastName, address, city, phoneNumber);
// checks is the node is emty, and starts a new node
        if (start == null) {
            start = newNode;
        } else {
            ListNode current = start;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }
// deletes information from the phonebook by checking the phonenumber
// if the phone number is the same a new node starts 
    public void deleteEntry(String phoneNumber) {
        if (start == null) {
            System.out.println("No entries to delete.");
            return;
        }

        if (start.getPhoneNumber().equals(phoneNumber)) {
            start = start.getNext();
            return;
        }

        ListNode current = start;
        ListNode previous = null;

        while (current != null && !current.getPhoneNumber().equals(phoneNumber)) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            previous.setNext(current.getNext());
        } else {
            System.out.println("Contact number not found.");
        }
    }
// to change info in the phonebook by phone number search
// it checks all nodes until phone number match
// changes current info to new info
    public void modifyEntry(String phoneNumber, String newFirstName, String newLastName,
     String newAddress, String newCity) {
        ListNode current = start;
//list check
        while (current != null && !current.getPhoneNumber().equals(phoneNumber)) {
            current = current.getNext();
        }

        if (current != null) {
            //current.setPhoneNumber(newPhoneNumber);
            current.setFirstName(newFirstName);
            current.setLastName(newLastName);
            current.setAddress(newAddress);
            current.setCity(newCity);
        } else {
            System.out.println("Contact with the provided phone number not found.");
        }
    }
// to return all info from the phonebook
    public void printPhonebook() {
        if (start == null) {
            System.out.println("Phonebook is empty.");
            return;
        }

        ListNode current = start;
        while (current != null) {
            System.out.println("First Name: " + current.getFirstName());
            System.out.println("Last Name: " + current.getLastName());
            System.out.println("Address: " + current.getAddress());
            System.out.println("City: " + current.getCity());
            System.out.println("Phone Number: " + current.getPhoneNumber());
            System.out.println();
// checks the list 
            current = current.getNext();
        }
    }
}
