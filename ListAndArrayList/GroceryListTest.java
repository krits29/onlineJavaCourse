import java.util.Scanner;

/**
 * Created by kritisharma on 12/25/19.
 */
public class GroceryListTest
{
    private static Scanner scan = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args)
    {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit)
        {
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            scan.nextLine();

            if (choice == 0)     // shortcut to hover over the switch/if and click on the lightbulb
            {
                printInstructions();
            }
            else if (choice == 1)
            {
                groceryList.printList();
            }
            else if (choice == 2)
            {
                addItem();
            }
            else if (choice == 3)
            {
                modifyItem();
            }
            else if (choice == 4)
            {
                removeItem();
            }
            else if (choice == 5)
            {
                searchForItem();
            }
            else if (choice == 6)
            {
                quit = true;

            }
        }
    }

    public static void printInstructions()
    {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem()
    {
        System.out.print("Please enter the grocery item: ");
        groceryList.addItem(scan.nextLine());
    }

    public static void modifyItem()
    {
        System.out.print("Enter item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scan.nextLine();
        groceryList.modifyList(itemNo - 1, newItem);
    }

    public static void removeItem()
    {
        System.out.print("Enter item number: ");
        int itemNo = scan.nextInt();
        scan.nextLine();
        groceryList.removeItem(itemNo - 1);

    }

    public static void searchForItem()
    {
        System.out.print("Item to search for: ");
        String searchItem = scan.nextLine();
        if (groceryList.findItem(searchItem) != null)
        {
            System.out.println("Found " + searchItem + " in  our grocery list");
        }
        else
        {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }
}
