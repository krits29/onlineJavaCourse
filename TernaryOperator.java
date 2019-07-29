package academy.learnprogramming;

public class TernaryOperator
{
    public static void main(String[] args)
    {
        boolean isCar = false;
        if(isCar == true)
        {
            System.out.println("this is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }


        double first = 20.00d;
        double second = 80.00d;
        double total = (first + second) * 100.00;
        System.out.println("total is: " + total);
        double remainder = total % 40.00d;
        System.out.println("remainder is: " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoRemainder);
        if (!isNoRemainder)
        {
            System.out.println("Got some remainder");
        }



    }
}
