/**
 * Created by kritisharma on 8/14/19.
 */
public class SumOddRange
{
    public static boolean isOdd (int number)
    {
        if (number < 0)
        {
            return false;
        }
        else if (!(number % 2 == 0))
        {
            System.out.println("odd");
            return true;
        }
        else
        {
            System.out.println("even");
            return false;
        }
    }

    public static int sumOdd( int start, int end)
    {
        int sum = 0;

        if ( start > end  || start < 0 || end < 0)
        {
            System.out.println("Invalid start and end values");
            return -1;
        }

        for(int i = start; i <= end; i++)
        {
            if (isOdd(i)==true)
            {
                sum = sum + i;
            }
        }
        System.out.println(sum);
        return sum;
    }
}
