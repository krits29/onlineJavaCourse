/**
 * Created by kritisharma on 12/23/19.
 */
public class Arrays
{
    public static void main(String[] args)
    {
        //multiple ways to initialize arrays

        //1

        int[] ary = new int[10];  //defined an integer array with 10 slots
        ary[5] = 50;    // assigned element 6 with 50 (arrays always start with 0

        System.out.println(ary[5]);

        //2

        int[] ray = {1,2,3,4,5,6,7,8,9,10};  // pre assigning all these values

        System.out.println(ray[0]);
        System.out.println(ray[5]);
        System.out.println(ray[8]);

        //3
        int[] yay = new int[10];
        for(int i = 0; i < yay.length; i++)  // using a for loop to assign values
        {
            yay[i] = i * 10;
        }

        printArray(yay);  // no brackets here - just the name
    }

    public static void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)    // arrays have this length property
        {
            System.out.println(i + " value is " + array[i]);
        }
    }
}
