import java.util.ArrayList;
import java.util.Scanner;

public class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i).getName());
            }
        }
    }

    public void viewContactDetails(int index) {
        if (index >= 0 && index < contacts.size()) {
            System.out.println(contacts.get(index));
        } else {
            System.out.println("Invalid contact index.");
        }
    }

    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println(contact);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("Invalid contact index.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager contactManager = new ContactManager();
        int choice;

        do {
            System.out.println("Contact Management System:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. View Contact Details");
            System.out.println("4. Search Contact");
            System.out.println("5. Delete Contact");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, phoneNumber, email);
                    contactManager.addContact(contact);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    System.out.print("Enter contact index to view details: ");
                    int indexToView = scanner.nextInt() - 1;
                    contactManager.viewContactDetails(indexToView);
                    break;
                case 4:
                    System.out.print("Enter name to search: ");
                    String searchName = scanner.nextLine();
                    contactManager.searchContact(searchName);
                    break;
                case 5:
                    System.out.print("Enter contact index to delete: ");
                    int indexToDelete = scanner.nextInt() - 1;
                    contactManager.deleteContact(indexToDelete);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
