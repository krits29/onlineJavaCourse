/**
 * Created by kritisharma on 2/12/20.
 */

import java.util.Scanner;

public class MobilePhone
{
    private static Scanner scan = new Scanner(System.in);
    private static Contacts contacts = new Contacts();

    public static void main(String[] args)
    {
        boolean quit = false;
        printInstructions();
        int choice = 0;

        while(quit == false)
        {
            System.out.println("Enter your choice:");
            choice = scan.nextInt();
            if (choice == 0)
            {
                printInstructions();
            }
            else if (choice == 1)
            {
                addContact();
            }
            else if (choice == 2)
            {
                removeContact();
            }
            else if (choice == 3)
            {
                modifyContact();
            }
            else if (choice == 4)
            {
                searchContact();
            }
            else if (choice == 5)
            {
                contacts.print();
            }
            else if (choice == 6)
            {
                quit = true;
            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("Press: ");
        System.out.println("0 - print choice options");
        System.out.println("1 - add a contact");
        System.out.println("2 - remove a contact");
        System.out.println("3 - modify a contact");
        System.out.println("4 - search for a contact");
        System.out.println("5 - print contacts");
        System.out.println("6 - quit");
    }

    public static void addContact()
    {
        String name;
        System.out.print("Enter the name of the contact: ");
        scan.nextLine();
        name = scan.nextLine();
        contacts.addContact(name);

    }

    public static void removeContact()
    {
        contacts.print();
        System.out.println("Enter the number of the contact you want to remove: ");
        contacts.removeContact(scan.nextInt() - 1);
    }

    public static void modifyContact()
    {
        contacts.print();
        System.out.println("Enter the number of the contact you want to modify");
        scan.nextLine();
        int num = scan.nextInt();
        System.out.println("Enter the modified name of the contact");
        scan.nextLine();
        contacts.modifyContact(num - 1, scan.nextLine());
    }

    public static void searchContact()
    {
        System.out.println("Enter the name of the contact you would like to search for");
        scan.nextLine();
        contacts.findContact(scan.nextLine());
    }

}
