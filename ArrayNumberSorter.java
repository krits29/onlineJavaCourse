/**
 * Created by kritisharma on 12/23/19.
 */
import java.util.Scanner;

public class ArrayNumberSorter
{
    public static void main(String[] args)
    {
        int[] oldArray = getIntegers(5);       // getting the inputted array
        int[] sorted = sortIntegers(oldArray); // sorting the array
        printArray(sorted);
    }

    public static int[] getIntegers(int capacity)
    {
        int[] a = new int[capacity];

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter " + a.length + " numbers:");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print("Number " + (i + 1) + ": ");
            a[i] = scan.nextInt();
        }
        System.out.println("Thanks");

        return a;
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)    // arrays have this length property
        {
            System.out.println(i + " array value is " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] oldArray)
    {
        int[] newArray = new int[oldArray.length];     // initiallize the array -- Super important

        for(int i = 0; i < oldArray.length; i++)
        {
            newArray[i] = oldArray[i];   // copying the array
        }


        // sorting the array; create a while loop with a for loop inside it

        boolean go = true;    // while loop will continue until we make it false
        int holder = 0;       // temporary variable

        System.out.println("Sorted from highest to lowest: ");

        while(go)
        {
            go = false;
            for(int i = 0; i < newArray.length - 1; i++)
            {
                if(newArray[i] < newArray[i + 1])
                {
                    holder = newArray[i];
                    newArray[i] = newArray[i + 1];    //swap
                    newArray[i+1] = holder;
                    go = true;
                }
            }
        }
        return newArray;
    }
}
