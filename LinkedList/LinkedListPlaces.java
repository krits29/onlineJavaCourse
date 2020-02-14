/**
 * Created by kritisharma on 2/13/20.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListPlaces
{
    public static void main(String[] args)
    {
//        LinkedList<String> places = new LinkedList<String>();
//        places.add("Seattle");
//        places.add("Bellevue");
//        places.add("Redmond");
//        places.add("Kirkland");
//        places.add("Sammamish");
//        places.add("Bothel");
//        places.add("Woodinville");
//
//        printList(places);
//
//        places.add(1, "Tacoma");
//        printList(places);
//
//        places.remove(6);
//        printList(places);

        LinkedList<String> morePlaces = new LinkedList<String>();

        System.out.println("alphabetical:");
        addInOrder("Washington", morePlaces);
        addInOrder("California", morePlaces);
        addInOrder("Oregon", morePlaces);
        addInOrder("Arizona", morePlaces);
        addInOrder("Nevada", morePlaces);
        addInOrder("Texas", morePlaces);
        addInOrder("New York", morePlaces);
        addInOrder("Washington", morePlaces);

        printList(morePlaces);

        visit(morePlaces);

    }

    private static void printList(LinkedList<String> list)
    {
        Iterator<String> i = list.iterator();    // kind of like a for loop (i = 0, i < list.size etc etc)
        while(i.hasNext())   // while there is another link still available
        {
            System.out.println("Now visiting " + i.next());    // i.next() is like i++ //gives the current record and then moves on
        }
        System.out.println("----------------------------");

    }

    private static boolean addInOrder(String newCity, LinkedList<String> list)
    {
        ListIterator<String> stringListIterator = list.listIterator();

        while(stringListIterator.hasNext())
        {
            int comparision = stringListIterator.next().compareTo(newCity);

            if(comparision == 0)  // they are equal, so dont add
            {
                System.out.println(newCity + " is already included as a destination");
                return false;
            }
            else if(comparision > 0)  // new item should appear before
            {
                //need to move back because the .next() has already moved on
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            else if(comparision < 0)
            {
                //leave
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities)
    {
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true; // create another boolean to make sure there isnt duplicates
        //track the direction

        ListIterator<String> i = cities.listIterator();

        if(cities.isEmpty())   //check if the first value is empty
        {
            System.out.println("No cities in the itenerary");
            return;
        }
        else
        {
            System.out.println("Now visiting " + i.next());
            printMenu();
        }

        while(!quit)
        {
            int action = scan.nextInt();
            scan.nextLine();
            if(action == 0)
            {
                System.out.println("Vacation over");
                quit = true;
            }
            else if(action == 1)
            {
                if(!goingForward)
                {
                    if(i.hasNext())
                    {
                        i.next();
                        //System.out.println("Now visiting " + i.next());
                    }
                    goingForward = true;
                }

                if(i.hasNext())
                {
                    System.out.println("Now visiting " + i.next());
                }
                else
                {
                    System.out.println("Reached end of list (press 3 to see options)");
                    goingForward = false;
                }
            }
            else if(action == 2)
            {
                if(goingForward)
                {
                    if(i.hasPrevious())
                    {
                        i.previous();
                    }
                    goingForward = false;
                }

                if(i.hasPrevious())
                {
                    System.out.println("Now visting " + i.previous());
                }
                else
                {
                    goingForward = true;
                    System.out.println("At the start of the list");
                }
            }
            else if(action == 3)
            {
                printMenu();
            }
        }
    }

    private static void printMenu()
    {
        System.out.println("Press:");
        System.out.println("0 - quit");
        System.out.println("1 - go to next city");
        System.out.println("2 - go to previous city");
        System.out.println("3 - print menu options");
    }
}
