import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by kritisharma on 3/29/20.
 */
public class Exceptions
{
    public static void main(String[] args)
    {
        int x = 98;
        int y = 0;

        System.out.println(divideLBYL(x, y));
        System.out.println(divideEAFP(x, y));
        //System.out.println(divide(x, y)); throws an exception

        int z = getInt();
        System.out.println("z is " + z);

        z = getIntLBYL();
        System.out.println("z is " + z);

        z = getIntEAFP();
        System.out.println("z is " + z);

    }

    public static int getInt()
    {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static int getIntLBYL()
    {
        Scanner scan = new Scanner(System.in);
        boolean isValid = true;
        System.out.println("Enter an int");
        String str = scan.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                isValid = false;
                break;
            }
        }
        if(isValid)
        {
            return Integer.parseInt(str);
        }
        else
        {
            System.out.println("sorry that is invalid");
            return 0;
        }
    }

    public static int getIntEAFP()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an int");
        try
        {
            return scan.nextInt();
        }
        catch(InputMismatchException e)
        {
            return 0;
        }
    }

    // LBYL - look before you leap
    // EAFP - easy to ask for forgiveness than permission

    public static int divideLBYL(int x, int y)
    {
        if(y != 0)    //LBYL
        {
            return x / y;
        }
        else
        {
            return 0;
        }
    }

    public static int divideEAFP(int x, int y)
    {
        try
        {
            return x / y;
        }
        catch(ArithmeticException e)
        {
            return 0;
        }
    }

    private static int divide(int x, int y)
    {
        return x / y;
    }
}
