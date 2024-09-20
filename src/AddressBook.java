import java.util.ArrayList;
public class AddressBook {
    private ArrayList<BuddyInfo> buds;

    public AddressBook(){
        buds = new ArrayList<>();
    }
    public void addBuddy(BuddyInfo buddy){
        buds.add(buddy);
        System.out.println(buddy.getName() + " has been added to the address book.");
    }
    public boolean removeBuddy(BuddyInfo buddy){
        boolean removed = buds.remove(buddy);
        if (removed) {
            System.out.println(buddy.getName() + " has been removed from the address book.");
        } else {
            System.out.println(buddy.getName() + " was not found in the address book.");
        }
        return removed;
    }

    public void displayBuddies() {
        System.out.println("Buddies in Address Book:");
        for (BuddyInfo buddy : buds) {
            System.out.println("Name: " + buddy.getName() + ", Address: " + buddy.getAddress() + ", Phone: " + buddy.getPhoneNumber());
        }
    }

    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
