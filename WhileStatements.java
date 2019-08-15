/**
 * Created by kritisharma on 8/15/19.
 */
public class WhileStatements
{
    public static void main(String[] args)
    {
        int number = 4;
        int finishNumber = 20;
        int counter = 0;

        while (number <= finishNumber)
        {
            number++;
            if (!isEvenNumber(number))
            {
                continue; // goes to the end of the loop and continues on, and skips any other code that is in between
            }

            counter++;
            System.out.println(number);

            if ( counter >= 5 )
            {
                break;
            }
        }

        System.out.println("Total even #s " + counter);
    }

    public static boolean isEvenNumber(int num)
    {
        if (num % 2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
