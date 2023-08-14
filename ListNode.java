// Cristian Palma
// CS 145 
//07/18/2023

// listnode gives acces to the private information to be used in the other class
// all information fiels are to be private and hard to change 

public class ListNode {

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String phoneNumber;
    private ListNode next;

    public ListNode(String firstName,String lastName,String address,String city,
                                                             String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
// getter and setter methods for the name,
// lastname, address, city, phone number
        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
        public String getAddress() {
        return address;
        }
        public void setAddress(String address) {
            this.address = address;
        }
        public String getCity() {
            return city;
        }
        public void setCity (String city) {
            this.city = city;
        }
        public String getPhoneNumber() {
            return phoneNumber;
        }
        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
        public ListNode getNext() {
            return next;
        }
        public void setNext(ListNode next) {
            this.next = next;
        }
    }


     
