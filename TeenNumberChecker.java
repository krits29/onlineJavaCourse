/**
 * Created by kritisharma on 8/1/19.
 */
public class TeenNumberChecker
{
    public static boolean hasTeen(int a, int b, int c)
    {
        if((12 < a && a < 20) || (12 < b && b < 20) || (12 < c && c < 20))
        {
            System.out.println("There is at least one teen number in that list");
            return true;
        }

        System.out.println("There are no teen numbers in that list");
        return false;
    }

    public static boolean isTeen(int one)
    {
        if (12 < one && one < 20)
        {
            System.out.println("Yay! It's a teen number!");
            return true;
        }

        System.out.println("NOPE! It's not a teen number");
        return false;
    }
}
