import java.util.ArrayList;

public class ContactService {
   //Create array to hold contacts
   private ArrayList<Contact> contacts;

   //Constructor - default
   public ContactService() {
       contacts = new ArrayList<>();
   }

   //Method to add a contact, but first determines if it exists in the list
   public boolean add(Contact contact) {
       //Check to see if item is already in list
       boolean alreadyPresent = false;
       for (Contact c : contacts) {
           if (c.equals(contact)) {
               alreadyPresent = true;
           }
       }
       //If this item is no already in the list then add to the list
       if (!alreadyPresent) {
           contacts.add(contact);
           System.out.println("Contact Added Successfully!");
           return true;
       } else {
           System.out.println("Contact already present");
           return false;
       }
   }

   //Method to remove a contact but determines if it is in list first
   public boolean remove(String contactID) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               contacts.remove(c);
               System.out.println("Contact removed Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

   //Method to update contact given the ID called, checks for empty string
   public boolean update(String contactID, String firstName, String lastName, String numberAddress) {
       for (Contact c : contacts) {
           if (c.getContactID().equals(contactID)) {
               if (!firstName.equals(""))
                   c.setFirstName(firstName);
               if (!lastName.equals(""))
                   c.setLastName(lastName);
               if (!numberAddress.equals(""))
                   c.setNumberAddress(numberAddress);
               System.out.println("Contact updated Successfully!");
               return true;
           }
       }
       System.out.println("Contact not present");
       return false;
   }

}