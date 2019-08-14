package academy.learnprogramming;

public class ForLoop
{
    public static void main(String[] args)
    {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0 , 2.0));
//      System.out.println("10000 at 3% interest = " + calculateInterest(10000.0 , 3.0));
//      System.out.println("10000 at 4% interest = " + calculateInterest(10000.0 , 4.0));
//      System.out.println("10000 at 5% interest = " + calculateInterest(10000.0 , 5.0));
//      System.out.println("10000 at 6% interest = " + calculateInterest(10000.0 , 6.0));

        for(int percent = 2; percent < 9; percent++)
        {
            System.out.println("10000 at " + percent + "% interest = " + calculateInterest(10000.0, percent));
        }

    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }
}
