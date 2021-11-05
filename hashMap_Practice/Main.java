package hashMap_Practice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PhoneContacts phoneContacts = new PhoneContacts();
        Scanner scanner = new Scanner(System.in);
        System.out.print("""
                Reference book
                Enter the name of the contact group:
                """);

        while (true) {
            String groupName = scanner.nextLine();
            if (groupName.equalsIgnoreCase("no")) {
                break;
            }
            phoneContacts.addGroup(groupName);
            System.out.println("Create another group (enter a name or \"no\")");
        }

        while (true) {
            System.out.println("Create contact (Enter the name and number of the contact or \"no\")");
            String contactName = scanner.next();
            String contactNumber = scanner.nextLine();

            if (contactName.equalsIgnoreCase("no")) {
                break;
            }
            Contact contact = new Contact(contactName, contactNumber);

            System.out.println("Specify contact groups separated by a space");
            String[] groups = scanner.nextLine().split(" ");
            phoneContacts.addContactToGroup(groups, contact);
        }

        phoneContacts.printContacts();
        phoneContacts.printSortedContacts();
    }
}