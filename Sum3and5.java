/**
 * Created by kritisharma on 8/14/19.
 */
public class Sum3and5
{
    public static void main(String[] args)
    {
        int counter = 0;
        int sum = 0;

        for(int i = 1; i <= 1000; i ++)
        {
            if ((i % 3 == 0) && (i % 5 == 0))
            {
                counter++;
                sum += i;
                System.out.println(i);
            }

            if (counter == 5)
            {
                break;
            }
        }

        System.out.println("Sum = " + sum);
    }
}
