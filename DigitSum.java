/**
 * Created by kritisharma on 8/15/19.
 */
public class DigitSum
{
    public static void main(String[] args)
    {
        sumDigits(122);
    }

    public static int sumDigits (int number)
    {
        if (number < 10)
        {
            return -1;
        }

        int sum = 0;

        while (number>0)
        {
            int digit = number % 10;
            System.out.println(digit);
            sum = sum + digit;
            System.out.println(number);
            number = number/10;
        }

        System.out.println(sum);
        return sum;

    }
}
