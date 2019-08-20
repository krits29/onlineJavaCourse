/**
 * Created by kritisharma on 8/15/19.
 */
public class NumberPalindrome
{
    public static void main(String[] args)
    {
        System.out.println(isPalindrome(-500006));
    }

    public static boolean isPalindrome( int number )
    {
        if (number < 0 )
        {
            number = (0 - number); // turn negative number to positive: 500006
        }

        int digit = 0;
        int palnumber = number; // palnumber = 500006
        int reverse = 0;


        if (number == 0)
        {
            return true;
        }

        while ( palnumber > 0 )
        {
            digit = palnumber % 10;

            // digit = 6
            // digit = 0
            // digit = 0
            // digit = 0
            // digit = 0
            // digit = 5


            palnumber = palnumber / 10;

            // palnumber = 50000.6
            // palnumber = 5000.06
            // palnumber = 500.006
            // palnumber = 50.0006
            // palnumber = 5.00006
            // palnumber = .500006

            reverse = reverse * 10;

            // reverse = 0
            // reverse = 60
            // reverse = 600
            // reverse = 6000
            // reverse = 60000
            // reverse = 600000

            reverse = reverse + digit;

            // reverse = 6
            // reverse = 60
            // reverse = 600
            // reverse = 6000
            // reverse = 60000
            // reverse = 600005


            // first we tried this ... but it didn't work
            // reverse += digit * Math.pow(10, ex++);

        }

        System.out.println(number);
        System.out.println(reverse);
        return (number == reverse);
    }
}
