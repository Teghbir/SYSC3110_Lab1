public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    // Default constructor
    public BuddyInfo() {
        this.name = "Default Name";
        this.address = "Default Address";
        this.phoneNumber = "Default Phone Number";
    }

    // Parameterized constructor
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Main method
    public static void main(String[] args) {

        AddressBook newAddyBook = new AddressBook();
        // Create a BuddyInfo object
        BuddyInfo buddy = new BuddyInfo("Homer", "742 Evergreen Terrace", "555-1234");
        BuddyInfo buddy2 = new BuddyInfo("Homer2", "7422 Evergreen Terrace2", "525-1234");


        newAddyBook.addBuddy(buddy);
        newAddyBook.displayBuddies();

        newAddyBook.removeBuddy(buddy);
        newAddyBook.displayBuddies();

        newAddyBook.addBuddy(buddy2);
        newAddyBook.displayBuddies();



    }
}
